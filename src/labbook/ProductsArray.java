package labbook;

import java.util.Arrays;
import java.util.Scanner;

public class ProductsArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter No.of Products: ");
		int n = sc.nextInt();
		System.out.println();
		String [] products = new String[n];
		
		for(int i=0;i<n;i++) {
			products[i] = sc.next();
		}
		Arrays.sort(products);
		System.out.println(Arrays.toString(products));
	}

}
