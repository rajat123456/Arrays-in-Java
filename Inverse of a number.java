/* Problem: Write a function that returns its inverse, where inverse is defined as follows

Inverse of 32145 is 12543. In 32145, “5” is at 1st place, therefore in 12543, “1” is at 5th place; in 32145, “4” is at 2nd place, 
therefore in 12543, “2” is at 4th place.

Time Complexity = Space Complexity = O(N)

*/

import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int copy=n;
        int digits=0;

        while(copy>0)
        {
            copy=copy/10;
            ++digits;
        }

        copy=n;
        int arr[]=new int[digits+1];

        for(int q=arr.length-1;q>=1;q--)
        {
            arr[q]=copy%10;
            copy=copy/10;
        }

        int[]res=new int[arr.length];

        for(int w=arr.length-1;w>=1;w--)
        {
            res[arr.length-arr[w]]=arr.length-w;
        }

        for(int g=1;g<res.length;g++)
        System.out.print(res[g]);


    }
}
