package labbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TimeBetween {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter the Date[yyyy-mm-dd]:");
			String date = br.readLine();
			LocalDate userDate = LocalDate.parse(date);
			Period period = userDate.until(LocalDate.now());
			System.out.println("Days : "+period.get(ChronoUnit.DAYS));
			System.out.println("Months : "+period.get(ChronoUnit.MONTHS));
			System.out.println("Years : "+period.get(ChronoUnit.YEARS));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
