// Maximum difference between two elements in an array such that larger element appears after the smaller, Approach 1 (Naive)
// Time Complexity -> O(n^2)
// Space Complexity -> O(1)

import java.util.*;
public class Solution {

    public static void main(String[] args) 
    {
        int arr[]={4,3,10,2,9,1,6};
        int cur_left=0;
        int cur_right=0;
        int cur_diff=0;
        int max_left=0;
        int max_right=0;
        
        // Since there is no element compared with the last element
        for(int i=0;i<arr.length-1;i++)
        {
            cur_left=arr[i];
            for(int j=i+1; j<arr.length;j++)
            {
                cur_right=arr[j];
                if(arr[j]<arr[i])
                    continue;
                
                // Because of (> below), the first Maximum difference element is printed, even if there are duplicates
                // If we put (>= below), then the farthest Maximum difference element is printed, if there are duplicates
                else if(arr[j]-arr[i]>cur_diff)
                {
                    cur_diff=arr[j]-arr[i];
                    max_left=arr[i];
                    max_right=arr[j];
                }
            }
            
        }
            System.out.println("Max Difference is: "+cur_diff+" with elements: "+max_left+" & "+max_right);
        
    }
    
}