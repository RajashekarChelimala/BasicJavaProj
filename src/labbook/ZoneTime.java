package labbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneTime {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the TimeZone Id : ");
		String id = br.readLine();
		
		ZonedDateTime zoneTime = ZonedDateTime.now(ZoneId.of(id));
		System.out.println("Date and Time in "+id+" is "+zoneTime);
	}

}
