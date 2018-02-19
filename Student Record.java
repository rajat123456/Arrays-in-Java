// Student Record

import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws Exception{
		
		for(int i=0;i<6;i++)
		 {
		     int marks[] = new int[6];
		     int sum=0;
		     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		     String name=br.readLine();
		     int T= Integer.parseInt(br.readLine());
		       for(int o=0;o<6;o++)
		           {
                       // to read multiple integers line
                      marks[o] =Integer.parseInt(br.readLine());
		           }
		           Arrays.sort(marks);
		           System.out.println("Minimum is "+ marks[0]);
		           System.out.println("Maximum is "+ marks[marks.length-1]);
		           for(int q=0;q<marks.length;q++)
		           {
		             sum+=marks[q];
		           }
		           System.out.println("Average is "+ sum/marks.length);
		           
		           for(int w=0;w<marks.length;w++)
		           {
		             if(marks[w]>=0 &&marks[w]<=20)
		             System.out.println("Grade is E");
		             
		             
		             else if(marks[w]>20 &&marks[w]<=40)
		             System.out.println("Grade is D");
		             
		             
		             else if(marks[w]>40 &&marks[w]<=60)
		             System.out.println("Grade is C");
		             
		             
		             else if(marks[w]>60 &&marks[w]<=80)
		             System.out.println("Grade is B");
		             
		             
		             else if(marks[w]>80 &&marks[w]<=100)
		             System.out.println("Grade is A");
		           }
		           
		 }
	}
}



