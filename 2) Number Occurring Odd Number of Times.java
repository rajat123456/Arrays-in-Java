// Find the Number Occurring Odd Number of Times, Approach 2 (Hash Approach)
// Time Complexity -> O(n)
// Space Complexity -> O(n) -> Using HashMap

import java.util.*;
public class Solution {

    public static void main(String[] args) 
    {
        int arr[]={2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        
        // HashMap<Key, Value>
        HashMap<Integer, Integer> hmap =new HashMap() ;
        for(int i=0;i<arr.length;i++)
        {
            // If that element is already present in HashMap, then incrementing it's count
            if(hmap.containsKey(arr[i]))
            {
                    // What is it's current count
                    int count=hmap.get(arr[i]);
                
                    // Incrementing it's current count
                    hmap.put(arr[i], count+1);
            }
            
            // If not, then put that element and initialize it's count as 1
            else
                hmap.put(arr[i],1);
        }
        
        for(Integer a:hmap.keySet())
        {
            if(hmap.get(a)%2!=0)
            {
                System.out.println(a); 
                return;
            }
                
        }
    }
}