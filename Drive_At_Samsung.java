//Drive at Samsung :)

//Implemented via Singly Link List
//Time Complexity O(n)-> For Traversing Linked List
//Space Complexity O(n)-> For Link List size

package garcia;
import java.util.*;

//Node Creation
class Node 
{
	int name;
	int packages;
	Node next;
	
	Node(int n, int p)
	{
		this.name=n;
		this.packages=p;
		this.next=null;
	}	
}

class Samsung
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		// Here are the testcases suppose 6 
		int testcases=sc.nextInt();
		int n,p,d,f;
		d=sc.nextInt();
		f=sc.nextInt();
		Node start,head;
		
		//Here is 1 of the 6 nodes created in the beginning
		start=new Node(d,f);
		head=start;
		
		//Now the rest 5 are created inside while loop because if we won't make the 1st Node outside then we can't
		// hold the references of the Nodes and all the Nodes are gone
		for(int i=0;i<testcases-1;i++)
		{
			n=sc.nextInt();
			p=sc.nextInt();
			//Node creation along with data parts(first is name and second is package)
			head.next=new Node(n,p);
			head=head.next;
		}
		
		//count is use to keep track of the number of persons selected
		//First person is always selected
		int count=1;
		Node current=start;
		Node forward=start.next;
		
		//This TrackOfPackages variable is use so as to keep track that the package of the next talented
		//person is always greater than the less talented person
        int TrackOfPackage=current.packages;
		while(forward!=null)
		{
			if(current.packages<forward.packages)
			{
				/*To understand this case(forward.packages>TrackOfPackage) run program with these test cases and comment
				the next 5 line (77-81)->
				    6
				    1 4
				    2 3
				    3 4
				    4 3
                                    5 4
				    6 3 
				*/
				//For above you get answer as 3 but it should be 1 
				
		        if(forward.packages>TrackOfPackage)
                        {
                                TrackOfPackage=forward.packages;
				++count;
                        }
		}
            current=current.next;
			forward=forward.next;
        }
		System.out.println(count);
	
	}
}
