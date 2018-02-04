//Array Left Rotation 
//Method 2(By Rotating 1 by 1)
//Space Complexity is O(1)
//Time Complexity is O(n*d)-> d is size of array and n is number of times to rotate

package ooo;
import java.util.Scanner;

class Arrays 
{
public static void main(String...args)
{
	int array[]={1,2,3,4,5,6,7};
	System.out.print("initial original array-> ");
	for(int g=0;g<array.length;g++) 
    {
    	System.out.print(array[g]+" ");
    }
	
	System.out.println();

	//rotate(array,number_of_times_rotate,size_of_array)
	rotate(array,2,7);
	
}

static void rotate(int array[],int n, int d)
{
	//Here Time Complexity becomes O(n*d)
   for(int i=0;i<n;i++)
   {
	   //O(n) times here
	   rotateleft(array,d);
   }
}

static void rotateleft(int array[],int d)
{
	int temp=array[0];
	for(int j=0;j<d-1;j++)
	{
		//O(d) times here
		array[j]=array[j+1];
	}
    array[d-1]=temp;
	
    for(int a=0;a<array.length;a++) 
    {
    	System.out.print(array[a]+" ");
    }
	
	System.out.println();

}
}  