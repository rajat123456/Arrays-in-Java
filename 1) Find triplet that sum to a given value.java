// Find triplet that sum to a given value
// Approach 1 -> Brute Force (Using 3 loops)
// Time Complexity -> O(n^3)
// Space Complexity -> O(1)

public class Main
{
	public static void main(String[] args) {
		
		int arr[]={-5,-2,0,1,2,6,9};
		int target=1;
		
		// To keep track that whether Triplet is found or not
		boolean found=false;
		for(int i=0;i<arr.length-2;i++)
		{
		    for(int j=i+1;j<arr.length-1;j++)
		    {
		        for(int k=j+1;k<arr.length;k++)
		        {
		            if(arr[i]+arr[j]+arr[k]==target)
		            {
		            System.out.println("Triplet is: "+arr[i]+","+arr[j]+","+arr[k]+" at indexes: "+i+","+j+","+k);
		            found=true;
		            }
		        }
		    }
		}
		if(found==false)
		System.out.println("Triplet not found");
	}
}
