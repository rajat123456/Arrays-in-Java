// Pair in the given array whose sum is closed to zero
// Time Complexity -> O(n)
// Space Complexity -> O(1)

public class Main
{
	public static void main(String[] args) {
	    
	    int arr[]={-79,-9,0,59,69,84};
	    
	    int left=0;
	    int right=arr.length-1;
	    int currsum;
	    int closestsum=Integer.MAX_VALUE;
	    int leftindex=left;
	    int rightindex=right;
	    
	    while(left<right)
	    {
	        currsum=arr[left]+arr[right];
	        
	        if(Math.abs(currsum)<Math.abs(closestsum))
	        {
	            closestsum=currsum;
	            leftindex=left;
	            rightindex=right;
	        }
	        
	        if(currsum<0)
	        ++left;
	        
	        else
	        --right;
	    }
		
		System.out.println("Closest sum is: "+closestsum+" and elements are: "+arr[leftindex]+" & "+arr[rightindex]);
	}
}