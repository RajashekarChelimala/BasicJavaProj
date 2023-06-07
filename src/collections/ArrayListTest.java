package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class ArrayListTest {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		String str = "abc";
		list.add(str);
		list.add("hello");
		list.add("1");
		list.add("xyz");
		
		System.out.println(list.get(0));
		System.out.println(list.size());
		
		System.out.println(list);
		
		System.out.println("Size: "+list.size());
		System.out.println(list.contains(42));
		System.out.println(list.contains("hello"));
		System.out.println(list.isEmpty());
		list.set(1, "welcome");
		System.out.println("list: "+list);
		
		list.add(2, "cgg");
		System.out.println(list);
		
		
		//list.clear();
		//System.out.println(list);
		//End of ArrayList
		
		//Start of LinkedList
		
		LinkedList ll = new LinkedList();
		
		ll.add("abc");
		ll.add(24.56);
		ll.add(110);
		ll.add(true);
		
		System.out.println("LinkedList: "+ll);
		
		//Vector
		List<String> vector = new Vector<>();
		System.out.println("Vector :"+ vector);
		
		System.out.println("--------------------------");
		
		HashSet<Double> hs = new HashSet<>();
		hs.add(14.34);
		hs.add(34.56);
		boolean b = hs.add(4.3);
		System.out.println(b);
		boolean a = hs.add(14.34);
		System.out.println(a);
		hs.add(10.32);
		System.out.println("HashSet: \n"+hs);
		
		System.out.println("---------------------------\nLinked Hash Set");
		Set<Double> lsh = new LinkedHashSet<>();
		lsh.addAll(hs);
		lsh.add(10.12);
		System.out.println(lsh);
		
		System.out.println("---------------------------\nTreeSet");
		Set<Double> ts = new TreeSet<>();
		ts.addAll(lsh);
		System.out.println(ts);
	}

}
