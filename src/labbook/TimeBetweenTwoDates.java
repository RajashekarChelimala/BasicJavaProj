package labbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TimeBetweenTwoDates {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Enter the Date 1 [yyyy-mm-dd]:");
			String date1 = br.readLine();
			System.out.println("Enter the Date 2 [yyyy-mm-dd]");
			String date2 = br.readLine();
			LocalDate userDate1 = LocalDate.parse(date1);

			LocalDate userDate2 = LocalDate.parse(date2);

			Period period = userDate1.until(userDate2);
			System.out.println("Days : " + period.get(ChronoUnit.DAYS));
			System.out.println("Months : " + period.get(ChronoUnit.MONTHS));
			System.out.println("Years : " + period.get(ChronoUnit.YEARS));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
