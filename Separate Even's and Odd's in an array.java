// Separate Even's and Odd's in an array, using 2 indexes(left and right) Approach
// This example is an Application of Separating 0's and 1's in an array
// Time Complexity -> O(n)
// Space Complexity -> O(1)

// Basically resultant array contains all Even's in left side and all Odd's at right side

class separate0and1
{
	public static void main(String[] args) 
	{
		int arr[] = new int[]{0, 1, 0, 1, 1, 1};
		
		int left=0;
		int right=arr.length-1;
		
		while(left<right)
		{
		  // At each iteration also checking that left is less than right  
		  while(arr[left]%2==0 && left < right)
		  ++left;
		  
		  while(arr[right]%2==1 && left < right)
		  --right;
		  
		  if(left<right)
		  {
		      // First assign then increment/decrement
		      // Swapping 0 with 1 (left with right)
		      arr[left++]=0;
		      arr[right--]=1;
		  }
		  
		}
		
		System.out.println("Array after separation ");
		
		for(int q=0;q<arr.length;q++)
		{
		    System.out.print(arr[q]+" ");
		}
		
	}
}