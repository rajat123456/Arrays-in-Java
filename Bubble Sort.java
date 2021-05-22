/* Problem: Bubble Sort 

Time Complexity= O(N^2)
Space Complexity= O(1)

*/


import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[]arr=new int[n];

        for(int q=0;q<arr.length;q++)
        {
            arr[q]=sc.nextInt();
        }

        for(int w=0;w<arr.length-1;w++)
        {
            boolean flag=false;
            for(int z=0;z<arr.length-w-1;z++)
            {
                if(arr[z]>arr[z+1])
                {
                    flag=true;
                    int temp=arr[z];
                    arr[z]=arr[z+1];
                    arr[z+1]=temp;
                }

            }

            if(flag==false)
            break;
        }

        for(int m=0;m<arr.length;m++)
        {
            System.out.println(arr[m]);
        }

    }
}
