//Majority element in an Array using Linear Search
//Time Comp O(n^2) in worst case for Sorting array, if array is already sorted then it is O(n/2)=O(n)
//Space Comple O(1)

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int count=0;
		int arr[]=new int[a];
		for(int j=0;j<a;j++)
		 {
		     arr[j]=sc.nextInt();
		 }
		Arrays.sort(arr);
		for( int i=0;i<arr.length/2;i++)
	       {
                if(arr[i]==arr[i+arr.length/2])
                {
                  System.out.println(arr[i]);
                  System.exit(0);
                }
                
	       }
	   
              System.out.println(-1);
	       
	}
}
