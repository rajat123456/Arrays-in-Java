// Time Complexity->O(n)

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no of employees");
		int n=sc.nextInt();
		int[][]arr=new int[n][2];
		HashMap<Integer, Integer>map=new HashMap();
		
		for(int q=0;q<arr.length;q++)
		{
		     System.out.println("Enter Supervisor no of employee "+(q+1));
		     int n1=sc.nextInt();
		     arr[q][0]=n1;
		     
		     System.out.println("Enter Likelihood value no of employee "+(q+1));
		     int x=sc.nextInt();
		     arr[q][1]=x;
		     
		     if(map.containsKey(n1))
		     {
		         int val=map.get(n1);
		         map.put(n1,val+x);
		     }
		     
		     else
		      map.put(n1,x);
		    
		}
		
		 for(int u=0;u<arr.length;u++)
		 {
		     if(map.containsKey(u))
		     {
		       int counter=map.get(u);
		       if(counter>=arr[u][1])
		       {
		        map.remove(u);
		        arr[u][1]=Integer.MIN_VALUE;
		       }
		       
		       else
		       arr[u][0]=Integer.MAX_VALUE;
		        
		     }
         }
         
         System.out.println("Employees invited to party are:");
         long score=0;
         
         for(int z=0;z<arr.length;z++)
         {
                 if(map.containsKey(arr[z][0]))
                 continue;
                 
                 if(arr[z][1]==Integer.MIN_VALUE)
                 continue;
                 
                 else
                 {
                  if(arr[z][0]==Integer.MAX_VALUE || true)
                  score+=arr[z][1];
                  System.out.println(z+1);
                 }
         }
		
		System.out.println("And their score is: "+score);
	}
}
