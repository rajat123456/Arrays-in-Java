// Problem: Sum the numbers present in 2 arrays and show resultant sum

/* 
  Time Complexity: O(m+n) -> Bcz we scan both arrays to sum there elements
  Space Complexity: Max(N,M) -> Taken a resultant array whose size is maximum of both of arrays's size
*/


import java.util.*;
public class Main {
    public static void main (String args[]) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr1=new int[n];

        for(int q=0;q<n;q++)
        {
            arr1[q]=sc.nextInt();
        }

        int m=sc.nextInt();
        int[]arr2=new int[m];

        for(int q=0;q<m;q++)
        {
            arr2[q]=sc.nextInt();
        }

        int max=Math.max(n,m);
        int sum=0;

        int[]res=new int[max+1];

        int carry=0;
        int fa=res.length-1;
        int z=arr1.length-1;
        int x=arr2.length-1;
      
        for(;z>=0;z--)
        {
            if(x<0)
            break;

            sum=arr1[z]+arr2[x]+carry;
            if(sum>9)
            {
                res[fa]=sum%10;
                carry=sum/10;
            }

            else if(sum<10)
            {
                res[fa]=sum;
                carry=0;
            }

            --x;
            --fa;
        }
      
      
      /* Case 1, when array1 is smaller then 2nd array.
         Eg:   9 9 9
             1 1 1 1
      */
      
        if(x<0 && z==0)
        {
            sum=arr1[x]+carry;

            if(sum>9)
            {
             res[fa]=sum%10;
             --fa;
             res[fa]=sum/10;
            }

            else
             res[fa]=sum;

        }
      
      
      /* Case 2, when array2 is smaller then 1st array.
         Eg:  9 9 9 9
                1 1 1
      */

        else if(z<0 && x==0)
        {
            sum=arr2[x]+carry;

            if(sum>9)
            {
             res[1]=sum%10;
             res[0]=sum/10;
            }

            else
             res[1]=sum;
        }
      

        /* Case 3, when both arrays are of same size.
         Eg:   9 9 9
               1 1 1
      */
      
        else
        {
            res[fa]=carry;
        }

        // Finally printing sum of both arrays, 0th index of resultant array represents the outermost carry.

        for(int g=0;g<res.length;g++)
        {
            if(g==0 && res[g]==0)
            continue;

            System.out.print(res[g]+", ");
        }

        System.out.print("END");

    }
}
