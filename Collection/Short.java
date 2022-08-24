package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Short {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(11);
		list.add(15);
		list.add(10);
		list.add(9);
		list.add(111);
		list.add(100);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		

	}

}
