package collections;

import java.util.ArrayList;
import java.util.Collections;

class SortExample {

	public static void main(String[] args) {
		ArrayList<Emp> emps = new ArrayList<>();
		
		emps.add(new Emp("pqr","5354321",12));
		emps.add(new Emp("xyz","8354321",11));
		emps.add(new Emp("abc","7354321",13));
		
		System.out.println(emps);
		
		Collections.sort(emps);
		
		System.out.println(emps);
		System.out.println("-------------Comparators-------------");
		ArrayList<Emp> emp1 = new ArrayList<>(emps);
		Collections.sort(emp1, new IdComparator());
		System.out.println(emp1);
		Collections.sort(emp1, new NameComparator());
		System.out.println(emp1);
	}

}
