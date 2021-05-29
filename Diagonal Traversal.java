// Problem: Given an array of M x N elements (M rows, N columns), return all elements of the array in diagonal order

/*

Eg: 1 2 3
     4 5 6   --------> 1 2 4 7 5 3 6 8 9
     7 8 9    Output
     
Time Complexity: O(m*n) 
Space Complexity: O(1)

*/

import java.util.*;
public class Main {
    public static void main (String args[]) {

        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();

        int[][]arr=new int[m][n];

        for(int q=0;q<m;q++)
        {
            for(int w=0;w<n;w++)
            {
                arr[q][w]=sc.nextInt();
            }
        }

        int rows=0;
        int cols=0;
        
        // way variable takes care, in which way, elements need to be printed/accessed either down to up or up to down
        int way=0;

        System.out.print(arr[0][0]+" ");

        while(true)
        {
             // if we are in the last cell, i.e, arr[m-1][n-1]
             if(rows==m-1 && cols==n-1)
                break;

            // Printing from up to down way
            if(way%2==0)
            {
                // If right side element in a row exist
                if(cols+1<n)
                {
                  ++cols;
                  while(rows<m && cols>=0)
                {
                    System.out.print(arr[rows][cols]+" ");
                    ++rows;
                    --cols;
                }
                --rows;
                ++cols;
                }

                // If right side element in a row not exist, then access 2nd row element same column
                else
                {
                    ++rows;
                    while(rows<m && cols>=0)
                   {
                    System.out.print(arr[rows][cols]+" ");
                    ++rows;
                    --cols;
                   }
                   --rows;
                   ++cols;
                }

                ++way;
            }

            // Printing from down to up way
            else
            {
                // If down row exist
                if(rows+1<m)
                {
                    ++rows;
                    while(rows>=0 && cols<n)
                {
                    System.out.print(arr[rows][cols]+" ");
                    --rows;
                    ++cols;
                }
                ++rows;
                --cols;

                }

                // If down row not exist, then going to next column same row
                else
                {
                    ++cols;
                    while(cols<n && rows>=0)
                    {
                        System.out.print(arr[rows][cols]+" ");
                        --rows;
                        ++cols;
                    }
                    ++rows;
                    --cols;
                }

                // incrementing way, so that next time array is accessed in different way compare to previous way
                ++way;
            }

        }
    }
}
