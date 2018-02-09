//Method 2
//Pair in an Array whose sum is equal to a given number 'x' USing Hashtable Approach
//Time Comp->O(n)
//Space Comp->O(n)[array size] +O(n) [hashtable size] = O(n)

package OSHEA;
import java.util.*;
public class Hash_Approach
{
    
	static Scanner sc=new Scanner(System.in);
	static int size=sc.nextInt();
    static int arr[]=new int[size];
	static int target;
	public static void main(String[] args)
	{
		for(int i=0;i<arr.length;i++)
		 {
		     arr[i]=sc.nextInt();
		 }
		 
		//Size of Hashtable = MAX element present in array + 1
		int hashtable[]=new int[max()];
		int temp;
	    int sum=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			temp=sum-arr[i];
			
			if(temp>=0 && hashtable[temp]==1)
			{
				System.out.print("Pair is "+arr[i]+" ");
				System.out.println(temp);
			}
			
			hashtable[arr[i]]=1;
			
		}
		
	}
	
	static int max()
		{
		    //Finding out the maximum element present in array
		    Arrays.sort(arr);
		    //Returning the size of Hashtable
		    return (arr[arr.length-1]+1);
		}
}
