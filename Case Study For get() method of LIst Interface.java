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
		
		l.get(-1); // Here it gives ArrayIndexOutOfBounds Exception
		l.get(6);  // Here it gives IndexOutOfBounds Exception
	}

}
