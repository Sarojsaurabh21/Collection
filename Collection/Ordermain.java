package Collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class Ordermain {

	public static void main(String[] args) {
		
		Order o1=new Order(1,"pizza",1000);
		Order o2=new Order(2,"barger",1000);
		Order o3=new Order(3,"samosha",1000);
		Order o4=new Order(4,"frankey",1000);
		
		HashMap<Integer,Order>map=new HashMap<Integer,Order>();
		map.put(o1.getOrderld(), o1);
		map.put(o2.getOrderld(), o2);
		map.put(o3.getOrderld(), o3);
		map.put(o4.getOrderld(), o1);
		for(Entry<Integer, Order> m:map.entrySet())
		{
			System.out.println(m);
		}

	}

}
