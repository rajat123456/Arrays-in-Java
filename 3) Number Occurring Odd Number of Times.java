// Find the Number Occurring Odd Number of Times, Approach 3 (Using XOR Operation)
// Time Complexity -> O(n)
// Space Complexity -> O(1)

/* Note:  1) XOR of two elements is 0 if both elements are identical(same)
          2) XOR of a number "x" with 0 is "x" itself.
          3) If any number is repeating even number of times then their XOR leads to 0
          4) If any number is repeating odd number of times then their XOR leads to same number
          
          Since below, only 1 number is occuring odd number of times, and rest are occuring even numnber of times, so we got 0 for rest
          of elements and finally we got the number itself which is occuring odd number of times
*/

import java.util.*;
public class Solution {

    public static void main(String[] args) 
    {
        int arr[]={2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        
        // Starting with 0
        int result=0;
        
        for(int i=0;i<arr.length;i++)
        {
          result = result ^ arr[i];    
        }
        System.out.println(res);
    }
}
