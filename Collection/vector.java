package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		Vector<Integer>v=new Vector<Integer>();
		v.add(12);
		v.add(12);
		v.add(12);
		v.add(12);
		System.out.println(v);
		
		Enumeration<Integer>e=v.elements();
         while(e.hasMoreElements())
         {
        	 System.out.println(e.nextElement());
         }
		
	}

}
