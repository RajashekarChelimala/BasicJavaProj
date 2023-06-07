package labbook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductsArrayList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter No.of Products: ");
		int n = sc.nextInt();
		System.out.println("Enter the Products: ");
//		String [] products = new String[n];
		List<String> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			list.add(sc.next());
		}
		
		Collections.sort(list);
		
		for(String s: list) {
			System.out.println(s);
		}
		
		
//		System.out.println(list);
//		Collections.reverse(list);
//		System.out.println(list);
		
	}

}
