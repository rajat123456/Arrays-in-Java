//Pair in an Array whose sum is equal to a given number 'x'
//Time Comp->O(n^2)

package OSHEA;
import java.util.*;
public class Pair_In_Array_Whose_Sum_Equal_To_Given_Number_x
{
	public static void main(String[] args)
	{
		int arr[]={5,2,3,7,8,5};
		//Given number->
		int x=10;
        for(int i=0;i<arr.length-1;i++)
        {
          	for(int j=i;j<arr.length-1;j++)
          	{
          		if(arr[i]+arr[j+1]==x)
          		{
          			System.out.print("Pair is "+i+" ");
          			System.out.println(j+1);
          		}
          	}
        }
		
		}
	
}
