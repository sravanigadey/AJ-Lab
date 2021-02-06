package collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ob = new ArrayList<String>();
		ob.add("Sravani");
		ob.add("Ramya");
		ob.add("Vidya");
		System.out.println("Array List elements inserted normobly:"+ob);
		ob.add(1,"Keerthi");
		ob.add(3,"Divya");
		System.out.println("ArrayList elements inserted based on index:"+ob);
		ob.remove("Divya");
		System.out.println("Array List element removed based on element:"+ob);
		ob.remove(1);
		System.out.println("Array List element removed based on their index:"+ob);
	}

}
