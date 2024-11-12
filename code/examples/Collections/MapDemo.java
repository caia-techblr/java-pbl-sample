import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer,String> cities;
		cities = new HashMap<Integer,String>();
		//cities = new TreeMap<Integer,String>(Collections.reverseOrder());
		
		cities.put(101, "Pune");
		cities.put(103, "Mumbai");
		cities.put(102, "Bengaluru");
		cities.put(105, "Delhi");
		cities.put(104, "Chennai");
		cities.put(101, "PCMC");
		
		/*for(Integer key :cities.keySet())
			System.out.println(""+cities.get(key));
		
		for(String value :cities.values())
			System.out.println(""+value);*/
		for(Entry<Integer,String> entry:cities.entrySet())
			System.out.println(entry.getKey() + "," + entry.getValue());
		
		cities.remove(103);
		
		Iterator<Integer> iter = cities.keySet().iterator();
		while(iter.hasNext())
			System.out.println(""+cities.get(iter.next()));
		
		Iterator<String > valueIter = cities.values().iterator();
		//TODO
		String s1="Delhi";
		System.out.println("" +cities.containsValue(s1));
		System.out.println("" +cities.get(106));
		
		
	}
}