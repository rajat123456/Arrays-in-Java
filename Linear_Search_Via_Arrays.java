//Linear Search via Arrays
//Time Comp->O(n)
package OSHEA;

import java.util.*;

public class Linear_Search_Via_Arrays{

	static int target;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		target=sc.nextInt();
		int arr[]=new int[6];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int index=search(arr);
		if(index==-1)
		System.out.println("Element not found");
		else
		System.out.println("Element found at index "+ index);
	}
	
	static int search(int []arr)
	{
		int i;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
				 return i;
		}
		//Element not found
		return -1;
	}
	
}