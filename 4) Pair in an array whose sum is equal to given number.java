// A pair in an array whose sum is equal to given number, using 2 indexes(left and right) 
// Assumption-> If array is Sorted
// Time Complexity -> O(n)
// Space Complexity -> O(1)

class Pair
{
	public static void main(String[] args) 
	{
		int arr[] = {0, 0, 1, 1, 1, 1};
	    int target=2;
	    int leftIndex=0;
	    int rightIndex=arr.length-1;
	    int maxleftIndex=0;
	    int maxrightIndex=arr.length-1;
	    int leftElement=arr[0];
	    int rightElement=arr[arr.length-1];
	    
	    while(leftIndex<rightIndex)
	    {
	        // Even if we find the farthest pair, we still traverse till we find the nearest pair in array
	        if(arr[leftIndex]+arr[rightIndex]==target)
	        {
	            leftElement=arr[leftIndex];
	            rightElement=arr[rightIndex];
	            maxleftIndex=leftIndex;
	            maxrightIndex=rightIndex;
	            --rightIndex;
	        }
	        
	        else if(arr[leftElement]+arr[rightElement]>target)
	        {
	            --rightIndex;
	        }
	        
	        // if(arr[leftElement]+arr[rightElement]<target)
	        else 
	            ++leftIndex;
	    }
	    
	    System.out.println("Pair is: "+leftElement+" & "+rightElement+" at index: "+maxleftIndex+" & "+maxrightIndex);
		
	}
}