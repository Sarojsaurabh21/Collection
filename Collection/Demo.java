package Collection;

import java.util.ArrayList;

public class Demo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>list=new ArrayList<Integer>();//we can takre print value in float staement
		list.add(12);
		list.add(18);
		list.add(22);
		list.add(44);
		list.add(55);
		list.add(2,96);//position can be manipulated
		System.out.println(list);
		list.remove(4);  //list will be remove
		System.out.println(list);//statment..36.00
		System.out.println("=========================================================================================================");
		ArrayList<Float>list1=new ArrayList<Float>();
		list1.add(34.5f);
		list1.add(30.7f);
		list1.add(342.5f);
		list1.add(12.5f);
		list1.add(60.6f);
		System.out.println(list1);
		System.out.println(list.size());
		System.out.println(list.contains(190));
		System.out.println(list.isEmpty());
		ArrayList<Integer>second=new ArrayList<Integer>();
		second=(ArrayList)list.clone();
		System.out.println(second);
		for(Integer i:list)
		{
			System.out.println(i);
		}
		System.out.println("==============================third====================================================");
		ArrayList<Integer>third=new ArrayList<Integer>();
		third=(ArrayList)list.clone();
		third.add(101);
		third.add(102);
		System.out.println(list.addAll(third));
		for(Integer i1:list)
		{
			System.out.println(list);
		}
		
		
		
		
		
		
		
		
		

	}

}
