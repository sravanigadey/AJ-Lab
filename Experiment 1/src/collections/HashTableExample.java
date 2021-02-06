package collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
	public static void main(String[] args) {
		Hashtable<String,String> ht = new Hashtable<>();
		ht.put("Sravani", "Gadey");
		ht.put("Ramya", "Ganta");
		ht.put("Vidya", "Kamana");
		
		System.out.println("Hash Table after insertion: ");
		for(Map.Entry m : ht.entrySet()) {
			System.out.println("First Name: " + m.getKey() + " , " + "Surname: " + m.getValue());
		}
		
		ht.remove("Vidya");
		System.out.println("Hash Table after deletion: ");
		for(Map.Entry m : ht.entrySet()) {
			System.out.println("First Name: " + m.getKey() + " , " + "Surname: " + m.getValue());
		}
	}
}