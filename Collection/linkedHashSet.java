package Collection;

import java.util.LinkedHashSet;

public class linkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String>set=new LinkedHashSet<String>();
		set.add("sau");
		set.add("oo");
		set.add("sss");
		set.add("aaau");
		set.add("sau");
		set.add("sau");//same data will not be printed ==this hashset print value throught natural type
		System.out.println(set);
	}

}
