//Binary to Decimal Conversion
//Time Complexity O(n^2)
//Space Complexity O(n)

package garcia;
class BinaryToDecimal 
{   
	static int total=0;
    
	public static void main(String...args)
{
	for(int j=0;j<2;j++)
	{   
		//We want 2 test cases(2 times to run program)
	    decimal();
	}
	
	//sum of the decimal conversions of the above 2 binary conversions
	System.out.println(total);

}
	
static void decimal()
{ 	
	java.util.Scanner sc=new java.util.Scanner(System.in);
	int no_of_digits=sc.nextInt();	
	
	//temporary array to hold the digits provided
	int temp[]=new int[no_of_digits];
	
	//copying the provided digits into the temporary array
	for(int j=0;j<no_of_digits;j++)
	{  temp[j]=sc.nextInt();
	}
	
	int power=0;
	int sum=0;
	for(int i=temp.length-1;i>=0;i--)
	{   
		//converting the binary number to decimal
		sum+=Math.pow(2, power)*temp[i];
		++power;
	}
	
	System.out.println(sum);
	total+=sum;	
}
}  