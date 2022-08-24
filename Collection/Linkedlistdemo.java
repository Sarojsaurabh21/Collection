package Collection;

import java.util.LinkedList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Linkedlistdemo {

	public static void main(String[] args) {
		
		LinkedList<Integer>list=new LinkedList<Integer>();
		list.add(101);
		list.add(101);
		list.add(101);
		list.add(101);
		list.add(101);
		System.out.println(list);
		list.addFirst(1011);
		list.addLast(1021);
		System.out.println(list);
		list.clear();
		System.out.println(list);
		list.add(0,1000);
		System.out.println(list);
		System.out.println("================================");
		System.out.println(list.contains(10000));
		list.add(1011);
		list.add(1021);
		list.add(1031);
		list.add(1041);
		list.add(10541);
		System.out.println(list);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		java.util.Iterator<Integer>it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
	}

}
