package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseExample {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Farooq");
		names.add("Rajashekar");
		names.add("Ajay");
		names.add("Sanjeeva");
		names.add("Vamshi");
		
		for(String str: names) {
			System.out.println(str+"\t"+str.length());
			StringBuffer sb = new StringBuffer(str);
			System.out.println(sb.reverse());
		}
		System.out.println("----------------------------");
		
		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("----------------------------");
		
		//Backward Traversal of list:LISTITERATOR
		
		ListIterator<String> litr = names.listIterator(names.size());
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
		System.out.println("---------------FOR EACH METHOD-------------");
		//Traversed in forward Direction
		names.forEach(e->System.out.println(e));
		
		System.out.println("SORTING OF ELEMENTS");
		TreeSet<String> set = new TreeSet<>();
		set.addAll(names);
		set.forEach(e->System.out.println(e));
		
	}

}
