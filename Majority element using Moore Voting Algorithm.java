// Finding the majority element in the given array, using Moore Voting Algorithm
// Time Complexity -> O(n) -> only single traversal of array, 2 times to check whether that computed element is really majority element
// Space Complexity -> O(1)

import java.util.*;
public class Solution {

    public static void main(String[] args) 
    {
        int arr[]={2,2,5,6,2,2};
        
        /* For such type of test cases we are traversing the array 2nd Time, to verify our majority element
           int arr[]={1,1,1,2,3,4,5}; */
            
        // Assume that the first element is majority element with count=1
        int majorityIndex=0;
        int count=1;

        // Getting the majority element through Moore Voting Algorithm
        int ele=GetMajorityElement(arr,count,majorityIndex);
        
        // Verifying whether that element which we got is really majority element
        int verify=IsMajority(arr, ele);
        
        if(verify==1)
            System.out.println("Majority Elment is: "+ele);
        
        else
            System.out.println("No Majority Elment Present");
    }
    
        static int GetMajorityElement(int arr[], int count, int majorityIndex)
    {
           // Starting from index 1 since we assumed that the first element is majority
           for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[majorityIndex])
            {
                ++count;
            }
            
            else
                --count;
            
            if(count==0)
            {
                majorityIndex=i;
                count=1;
            }
        }
            return arr[majorityIndex];
    }
    
    static int IsMajority(int arr[], int element)
    {
       int count=0;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]==element)
               ++count;
       }
        
        // if count of that element which we got is greater than half the length of array then, YES it is majority element
        if(count>arr.length/2)
            return 1;
        
        // If not greater than it is not majority element
        else
            return -1;
    }
    
}