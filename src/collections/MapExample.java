package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String,Integer> courses = new HashMap<>();
		
		courses.put("Core Java", 4000);
		courses.put("Basic Python", 3500);
		courses.put("Spring", 3000);
		courses.put("Android", 4000);
		courses.put("Android", 2000);

		System.out.println(courses);
		
		courses.forEach((k,v)->System.out.println(k+"=>"+v));
		System.out.println(courses.get("Core Java"));
		
		//iterating map using iterator
		
		Set set = courses.entrySet();
		System.out.println("Set:= "+set);
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry me = (Map.Entry)itr.next();
			System.out.println("MapEntry"+me);
			System.out.println(me.getKey()+"=>"+me.getValue());
		}
		
		int fees = courses.get("Core Java");
		int newFees = fees + 1000;
		courses.put("Core Java", newFees);
		System.out.println(courses.get("Core Java"));

	}

}