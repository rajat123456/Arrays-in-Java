package CF;

import java.util.*;

class Main {
    
	public static void main(String[] afrbs)
	{
		List l=new ArrayList(5);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
	
		l.remove(0);
		System.out.println(l);
		
		l.remove(1);
		System.out.println(l);
		
		// Here it gives IndexOutOfBounds Exception, but Checker Framework does not provide information
		// for this, because Index Checker is applicable only for fixed size Data Structures and not for 
		// Growable Data Structures like Lists
		l.remove(3); 
		
	}

}