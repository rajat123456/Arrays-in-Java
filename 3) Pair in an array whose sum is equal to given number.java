// A pair in an array whose sum is equal to given number, using Binary Search
// Assumption-> If array is Sorted
// Time Complexity -> O(nlogn) -> logn is for binary search, and we are doing it "n-1" times
// Space Complexity -> O(1)

import java.util.*;
public class Solution {

    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5,5};
        int target=7;
        for(int i=0;i<arr.length-1;i++)
        {
            int left=i+1;
            int right=arr.length-1;
            
            while(left<=right)
            {
                int mid=(left+right)/2;
                
                if(arr[i]+arr[mid]==target)
                {
                    System.out.println("Pair is: "+arr[i]+" & "+arr[mid]);
                }
              
                // In case of Duplicate Elements, we use >=, because duplicate element is present ahead of it, not behind
                if(target>=arr[i]+arr[mid])
                {
                    left=mid+1;
                }
                
                else
                    right=mid-1;
            }
        }
    }
}
