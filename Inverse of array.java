// Problem: Find inverse of an array

/* Approach 1: Iterativelxy
   Time Complexity = Space Complexity= O(N)

*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[]orig=new int[n];
        int[]copy=new int[n];

        for(int q=0;q<orig.length;q++)
        {
            orig[q]=sc.nextInt();
            copy[q]=orig[q];
        }

        for(int w=0;w<copy.length;w++)
        {
            copy[orig[w]]=w;
        }

        for(int z=0;z<copy.length;z++)
        {
            System.out.print(copy[z]+" ");
        }

    }
}




--------------------------------------------------
  
/* Approach 2: Recursively
   Time=Space Complexity=O(N)
   
*/
  
import java.util.*;
public class Main {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[]orig=new int[n];
        int[]copy=new int[n];

        for(int q=0;q<n;q++)
        {
            orig[q]=sc.nextInt();
            copy[q]=orig[q];
        }

        copy=inv(orig, copy, 0);

        for(int q=0;q<copy.length;q++)
        {
            System.out.print(copy[q]+" ");
        }

    }

    static int[]inv(int[]orig, int[]copy, int index)
    {
        if(index==orig.length)
        return copy;

        copy[orig[index]]=index;

        return inv(orig, copy, index+1);
     
    }

  }
