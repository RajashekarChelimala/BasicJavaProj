package collections;

import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		TreeSet<Emp> set = new TreeSet<>();
		
		set.add(new Emp("pqr", "54321923",3));
		set.add(new Emp("xyz", "54321923",1));
		set.add(new Emp("abc", "54321923",2));
		
		System.out.println(set);
		
	}

}
