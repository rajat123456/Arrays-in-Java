// Maximum difference between two elements in an array such that larger element appears after the smaller
// Approach 2 (Using Difference Array and Maximum Sum Subarray Concept)
// Time Complexity -> O(n)-> Since, we are traversing both the array's(original as well as difference array) only once
// Space Complexity -> O(n)-> Since here we are using the difference array whose size is equal to that of original array(almost)

import java.util.*;
public class Solution {

    public static void main(String[] args) 
    {
        int arr[]={3,1,4,7,5,100,10};
       
        // Size of Difference array is 1 less than the original array
        int diff[]=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++)
        {
           diff[i]=arr[i+1]-arr[i]; 
        }
        
        // Assuming in starting that the current difference is the first element of the difference array
        int cur_diff=diff[0];
        
        for(int i=1;i<diff.length;i++)
        {
            if(diff[i-1]>0)
                diff[i]+=diff[i-1];
            
            if(cur_diff<diff[i])
                cur_diff=diff[i];
        }
        
        System.out.println(cur_diff);
    }
    
}
