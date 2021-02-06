package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1244, "Sravani");
		hm.put(1246, "Ramya");
		hm.put(1260, "Vidya");
		hm.put(1261, "Keerthi");
		hm.put(1262, "Divya");
		hm.put(1267, "Raji");
		hm.put(508, "Tulasi");
		
		Set keys = hm.entrySet();
		Iterator itr = keys.iterator();
		
		System.out.println("HashMap after insertion:");
		while(itr.hasNext()) {
			Map.Entry me = (Map.Entry)itr.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue()); 
		}
		
		hm.remove(1262);
		System.out.println("HashMap after deletion:");
		Iterator itr1 = keys.iterator();
		while(itr1.hasNext()) {
			Map.Entry me = (Map.Entry)itr1.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue()); 
		}
		
		hm.replace(1260,"Mounika");
		System.out.println("HashMap after replace operation:");
		Iterator itr2 = keys.iterator();
		while(itr2.hasNext()) {
			Map.Entry me = (Map.Entry)itr2.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue()); 
		}
	}
}
