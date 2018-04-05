// Find the Number Occurring Odd Number of Times, Approach 1 (Brute Force)
// Time Complexity -> O(n^2)
// Space Complexity -> O(1)

import java.util.*;
public class Solution {

    public static void main(String[] args) 
    {
        int arr[]={2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        int ele=-1;
        for(int i=0;i<arr.length-1;i++)
        {
            // Since current element is visited, so it's count is initialized as 1
            int count=1;
          for(int j=i+1;j<arr.length;j++)
          {
              if(arr[i]==arr[j])
              count++;
          }
            
            if(count%2!=0)
            {
                ele=arr[i];
                System.out.println("Number is: "+ele);
                return;
            }
        }
        
           // If no one present odd number of times
           System.out.println("No Element present odd number of times");
    }
}