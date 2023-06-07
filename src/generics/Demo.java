package generics;

import java.awt.List;
import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
//		list.add("Hello");
		list.add(12);
		
		//Generics are Type Safe
		//These are type unsafe- can accept any data type
		
		ArrayList anotherList = new ArrayList();
		anotherList.add("Hello");
		anotherList.add(12);
		anotherList.add(1.2);
		anotherList.add(true);
		
		System.out.println(anotherList);
	}

}
