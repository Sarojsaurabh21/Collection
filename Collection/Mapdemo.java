package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Mapdemo {

	public static void main(String[] args) {
		HashMap<Integer ,String>map=new HashMap<Integer,String>();//hash map is print unorder data
		map.put(11,"horn");
		map.put(5,"gds");
		map.put(2,"horn");
		map.put(1,"porash");
		map.put(4,"hcary");
		System.out.println(map);
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		System.out.println(map.containsKey(11));
		System.out.println(map.containsValue("horn"));
		System.out.println(map.get(2));
		System.out.println(map.hashCode());
		map.remove(3);
		System.out.println(map);
		
		HashMap<Integer,String>map1=new HashMap<Integer,String>();
		map1=(HashMap<Integer, String>)map.clone();
		System.out.println(map1);
		java.util.Iterator<Entry<Integer, String>> it=map.entrySet().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		System.out.println("================================================================================================");
		
		LinkedHashMap<Integer,String>lmap=new LinkedHashMap<Integer,String>();//linked print natural way
		lmap.put(11,"apple");
		lmap.put(1,"gahjor");
		lmap.put(5,"ap");
		lmap.put(2,"ple");
		lmap.put(1,"pple");
		lmap.put(3,"applgampe");
		System.out.println(lmap);
    
		for(Map.Entry<Integer,String>m:lmap.entrySet())
		{
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		System.out.println("===three==============================================================");
		TreeMap<Integer,String>tmap=new TreeMap<Integer,String>();
		tmap.put(11,"saubo");
		tmap.put(11,"orange");
		tmap.put(11,"try");
		tmap.put(11,"crop");
		System.out.println(tmap);
		for(Map.Entry<Integer,String>m:lmap.entrySet())
		{
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		System.out.println("====================================================================================");
		
		System.out.println(map.entrySet());
		System.out.println(map.values());
		System.out.println(map.keySet());
	}

}
