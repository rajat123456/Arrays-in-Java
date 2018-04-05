// Maximum difference between two elements in an array such that larger element appears after the smaller
// Approach 4 (Using Minimum so far Concept)
// Time Complexity -> O(n)-> Since, we are traversing the original array exactly once
// Space Complexity -> O(1)-> Since here we are using the variables instead of any extra space

// Some Conditions for this implementation are ->

/* 1) The function assumes that there are 
      at least two elements in array.
   
   2) Output is a negative value if the
      array is sorted in decreasing order and 
      
   3) Output is 0 if elements are equal  */

import java.util.*;
public class Solution {

    public static void main(String[] args) 
    {
        int arr[]={4,3,10,2,9,1,6};
        int MaxDiffSoFar=arr[1]-arr[0];
        int MinElementSoFar=arr[0];
        int curr_diff=arr[1]-arr[0];
        int max_element=arr[1];
        int min_element=arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<MinElementSoFar)
                MinElementSoFar=arr[i];
            
            else
            {
                curr_diff=arr[i]-MinElementSoFar;
                
                if(curr_diff>MaxDiffSoFar)
                {
                    min_element=MinElementSoFar;
                    max_element=arr[i];
                    MaxDiffSoFar=curr_diff;
                }
            }
            
        }
        System.out.println("Maximum difference is: "+MaxDiffSoFar+" and elements are: "+min_element+" & "+max_element);
    }
    
}
