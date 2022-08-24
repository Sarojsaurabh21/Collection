package Collection;

import java.util.HashSet;

public class Setexample {

	public static void main(String[] args) {
		
		HashSet<Integer>set=new HashSet<Integer>(); // note=unorder list will be printed
		set.add(34);
		set.add(12);//duplicate data not wiil be printed
		set.add(90);
		set.add(12);
		set.add(78);
		System.out.println(set);
		HashSet<Integer>set1=new HashSet<Integer>();
		set1.add(45);
		set1.add(90);
		set.addAll(set1);
		System.out.println(set);
	
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		System.out.println(set.remove(12));
		System.out.println(set);
		
		System.out.println(set.retainAll(set1));
		System.out.println(set);
		System.out.println(set1);
		set.clear();
		System.out.println(set);
		System.out.println("====================================================================");
		System.out.println(set1.hashCode());
		System.out.println(set1.contains(89));//unique value of instance-object is called instance
		Object[]arr=set1.toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	//	System.out.println(set.toArray());
		
		

	}

}
