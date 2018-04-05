// A pair in an array whose sum is equal to given number, Using Hash Approach
// Assumption-> If array contains only positive values
// Time Complexity -> O(n) -> only single traversal of array
// Space Complexity -> O(n) -> due to hashtable(which is implemented as an array), since all array elements present inside hashtable

import java.util.*;
public class Solution {

    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5,5};
        int sum=7;
        int hash[]=new int[sum+1];
        for(int i=0;i<arr.length;i++)
        {
            int temp=sum-arr[i];
            
            if(temp>=0 && hash[temp]==1)
            {
                // This statement only executed when the hashtable contains the complement of the current array element(sum-arr[i])
                // i.e, if that element is already visited, if yes then it is present in hashtable and hence this statement execute, 
                // else not
                System.out.println("Pair is: "+arr[i]+" & "+temp);
            }
            
                // Putting every visited array element into hashtable
                hash[arr[i]]=1;
        }
    }
}
