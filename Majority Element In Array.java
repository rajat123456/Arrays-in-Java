//Majority element in an Array
// Time Comp O(n^2) in worst case for Sorting array
//Space Comple O(n) for use array

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int count=0;
		int arr[]=new int[a];
		int use[]=new int[a];
		for(int j=0;j<a;j++)
		 {
		     arr[j]=sc.nextInt();
		 }
		Arrays.sort(arr);
		for( int i=0;i<arr.length-1;i++)
	       {
                if(arr[i]==arr[i+1])
                {
                 ++use[arr[i]];
                }
	       }
	       
	       for(int j=0;j<use.length;j++)
	       {
	           
	       if(use[j]>=arr.length/2)
	       {
	       	System.out.println(j);
	       	System.exit(0);
	       }
	       	
	       }
	       
	       	System.out.println(-1);
	       
	}
}
