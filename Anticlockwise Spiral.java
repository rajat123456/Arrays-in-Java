/* Problem: Print 2-D array in Spiral Anticlockwise Manner

Eg: 1 2 3 
    4 5 6
    7 8 9
    
Output: 1, 4, 7, 8, 9, 6, 3, 2, 5, END


Time Complexity: O((m+n-1)*n)= O(n^2)
Space Complexity: O(1)

*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
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
        
        int p=0;
        
        
        // Overall outer loop run till (no of rows + no of columns -1)
        for(int d=0; d<(m+n); d++)
        {
            // Step 1: Down printing
            for(int q=0;q<n-p;q++)
            {
                if(arr[q+p][p]!=-1)
                {
                    System.out.print(arr[q+p][p]+", ");
                }
                
                // once an alement printed, marking -1, so that not printed again
                arr[q+p][p]=-1;
            }
        
            // Step 2: Right Printing
            for(int r=p+1;r<m-p;r++)
            {
                if(arr[m-p-1][r]!=-1)
                {
                    System.out.print(arr[m-p-1][r]+", ");
                }
                arr[m-p-1][r]=-1;
            }
            
            // Step 3: Up Printing
            for(int u=m-p-2;u>=p;u--)
            {
                if(arr[u][m-p-1]!=-1)
                {
                    System.out.print(arr[u][m-p-1]+", ");
                }
                arr[u][m-p-1]=-1;
            }
            
            // Step 4: Left Printing
            for(int z=m-p-1;z>p;z--)
            {
                if(arr[p][z]!=-1)
                {
                    System.out.print(arr[p][z]+", ");
                }
                arr[p][z]=-1;
            }
            
            // keep track of printed rows/columns
            ++p;
        }
        
        System.out.print("END");
        
    }
        
}
