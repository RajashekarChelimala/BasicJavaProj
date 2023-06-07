package labbook;
import java.util.*;


enum Gender {
	M, F
}

public class PersonDetailsEnum {
	
	String firstName;
	String lastName;
	Gender gender;
	String phone;

	public PersonDetailsEnum(String firstName, String lastName, Gender gender, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phone = phone;
	}
	
	public void printDetails() {
		System.out.println("Person Details:\n_________________\n\nFirst Name: " + this.firstName + "\nLast Name: " + this.lastName + "\nGender: " + this.gender + "\nPhone: " + this.phone + "\n");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Name:");
		String firstName = sc.next();
		System.out.println("Enter Last Name:");
		String lastName = sc.next();
		System.out.println("Enter Gender (M/F):");
		String genderInput = sc.next().toUpperCase();
		
		while (!genderInput.equals("M") && !genderInput.equals("F")) {
			System.out.println("Invalid gender. Please enter 'M' for Male or 'F' for Female:");
			genderInput = sc.next().toUpperCase();
		}
		
		Gender gender = Gender.valueOf(genderInput);
		
		System.out.println("Enter Phone No:");
		String phone = sc.next();
		
		PersonDetailsEnum p1 = new PersonDetailsEnum(firstName, lastName, gender, phone);
		
		p1.printDetails();

	}

}
