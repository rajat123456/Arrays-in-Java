//Binary Search via Arrays
//Array MUST be SORTED
//Time Comp->O(log n)->Each time Array Size reduced to Half

package OSHEA;
import java.util.*;
public class Binary_Search_Via_Arrays
{
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
		//It is the left index of array and not the left element
		int Lindex=0;
		//It is the right index of array and not the right element
		int Rindex=arr.length-1;
		for(int i=0;i<arr.length-1;i++)
		{
			 //To check whether array is sorted or not
		     if(arr[i]>arr[i+1])
		     {
		     System.out.println("Arary must be sorted");
		     return -1;
		     }
		}
		while(Lindex<=Rindex)
		{
		    int Mindex=(Lindex+Rindex)/2;
		    //Comparing the middle index element with the target element to find
			if(arr[Mindex]==target)
				//Returning the index of the target element which is needed to find
				return Mindex;
			
			//if target element > than middle index element
			else if(target>arr[Mindex])
				Lindex=Mindex+1;
			
			else
				//if target element < than middle index element
				Rindex=Mindex-1;
		}
		//Element not found
		return -1;
}
}