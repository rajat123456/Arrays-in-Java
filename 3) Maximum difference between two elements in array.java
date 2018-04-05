// Maximum difference between two elements in an array such that larger element appears after the smaller
// Approach 3 (Using Maximum Sum Subarray Concept) Here we didn't use difference array or any extra space
// Time Complexity -> O(n)-> Since, we are traversing both the array's(original as well as difference array) only once
// Space Complexity -> O(1)-> Since here we are using the variables instead of difference array

import java.util.*;
public class Solution {

    public static void main(String[] args) 
    {
        int arr[]={3,1,4,7,5,100,10};
        arr[0]=arr[1]-arr[0];
        
        // Assuming in starting that the current difference is the first element of the original array
        int cur_diff=arr[0];
        for(int i=1;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1]-arr[i];
            
            if(arr[i-1]>0)
                arr[i]+=arr[i-1];
            
            if(cur_diff<arr[i])
                cur_diff=arr[i];
        }
        
        System.out.println(cur_diff);
    }
    
}
