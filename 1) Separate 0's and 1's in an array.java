// Separate 0's and 1's in an array, Approach 1 (using Counting number of 0's)
// Time Complexity -> O(n)
// Space Complexity -> O(1)

// Basically resultant array contains all 0's in left side and all 1's at right side

class separate0and1
{
	public static void main(String[] args) 
	{
		int arr[] = new int[]{0, 1, 0, 1, 1, 1};
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]==0)
		    ++count;
		}
		
		for(int i=0;i<count;i++)
		{
		    arr[i]=0;
		}
		
		for(int j=count;j<arr.length;j++)
		{
		    arr[j]=1;
		}
		
		System.out.println("Array after separation ");
		
		for(int q=0;q<arr.length;q++)
		{
		    System.out.print(arr[q]+" ");
		}
		
	}
}
