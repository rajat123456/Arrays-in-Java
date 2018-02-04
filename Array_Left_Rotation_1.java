//Array Left Rotation 
//Method 1(By Using Temporary Array)
//Space Complexity is O(d)->size of temporary array
//Time Complexity is O(n)-> To shift elements 


package ooo;

import java.util.Scanner;

class Strings 
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
	
	//Scanner sc=new Scanner(System.in);
	//d-> Number of Elements to Rotate
	int d=3;
    int temp[]=new int[d];
    //Storing the Rotated elements in temp array
    for(int i=0;i<d;i++)
    {
    	temp[i]=array[i];
    }
    //Showing contents of the temporary array 
    System.out.print("temporary array-> ");
    for(int r=0;r<temp.length;r++)
    {
    System.out.print(temp[r]+" ");
    }
    
    System.out.println();

    //Moving the rest elements of original array to the front of it
    for(int j=d;j<array.length;j++)
    {
    	array[j-d]=array[j];
    }
    //Showing contents of the original array, when the elements are arranged in front 
    System.out.print("original array with elements are arranged in front-> ");
    for(int l=0;l<array.length;l++)
    {
    System.out.print(array[l]+" ");
    }
    
    System.out.println();
    
    //Placing the elements from temp array back to original array
    for(int k=0;k<temp.length;k++)
    {
    	array[array.length-d]=temp[k];
    	--d; //should be decremented and not increment, since we need to go up the array index 
    }
    
    //Displaying the original array
    System.out.print("original array-> ");
    for(int m=0;m<array.length;m++) 
    {
    	System.out.print(array[m]+" ");
    }
}
}  
