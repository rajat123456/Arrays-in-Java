// Find triplet that sum to a given value
// Approach 2 -> By Fixing 1 element and then moving 2 indexes (Left and Right)
// Time Complexity -> O(n^2)
// Space Complexity -> O(1)

public class Main
{
	public static void main(String[] args) {
		
		int arr[]={-5,-2,0,1,2,6,9};
		int target=1;
		
		for(int i=0;i<arr.length-2;i++)
		{
		    int left=i+1;
		    int right=arr.length-1;
		    while(left<right)
		    {
		            if(arr[i]+arr[left]+arr[right]==target)
		            {
		            System.out.println("Triplet is: "+arr[i]+","+arr[left]+","+arr[right]+" at indexes: "+i+","+left+","+right);
		            return;
		            }
		            
		            else if(arr[i]+arr[left]+arr[right]>target)
		            --right;
		            
		            else
		            ++left;
		    }
		}
	}
}