/* Problem: Rotate array 90 degree Anticlockwise

Eg: 1 2 3
    4 5 6
    7 8 9
    
Output: 3 6 9
        2 5 8
        1 4 7
        
Time Complexity: O(N^2) where N = no of rows and columns
Space Complexity: O(1)

*/


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
        int m=sc.nextInt();
        
        int[][]arr=new int[m][m];
        
        for(int q=0;q<m;q++)
        {
            for(int w=0;w<m;w++)
            {
                arr[q][w]=sc.nextInt();
            }
        }
        
        for(int q=m-1;q>=0;q--)
        {
            for(int w=0;w<m;w++)
            {
                System.out.print(arr[w][q]+" ");
            }
            
            System.out.println();
        }
        
        
    }
        
}
