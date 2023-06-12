package labbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class WarantyDate {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Product Purchase Date: ");
		LocalDate purchaseDate = LocalDate.parse(br.readLine());
		
		int years;
		int months;
		
		System.out.println("Enter the no.of Waranty Years : ");
		years = Integer.parseInt(br.readLine());
		System.out.println("Enter the no.of Waranty months : ");
		months = Integer.parseInt(br.readLine());
		
		LocalDate warantyDate = purchaseDate.plusYears(years).plusMonths(months);
		
		System.out.println("Waranty Date : "+ warantyDate);
		
	}

}
