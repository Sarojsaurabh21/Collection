package Collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Navigationset {

	public static void main(String[] args) {
		NavigableSet<Integer>set=new TreeSet<Integer>();
		set.add(12);
		set.add(121);
		set.add(112);
		set.add(35);
		
		set.add(102);
		set.add(132);
		set.add(122);
		System.out.println(set);
		System.out.println(set.last());
		System.out.println(set.first());
		System.out.println(set.higher(12));
		System.out.println(set.lower(121));
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
		System.out.println(set.ceiling(12));
		System.out.println(set.floor(121));
		
		
		
		
		

	}

}
