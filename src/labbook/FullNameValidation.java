package labbook;
import java.util.*;


//enum Gender {
//	M, F
//}

class BlankNameException extends Exception{
	public BlankNameException(String msg) {
		super(msg);
	}
}

public class FullNameValidation {
	
	String firstName; 
	String lastName;
	Gender gender;
	String phone;

	public FullNameValidation(String firstName, String lastName, Gender gender, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phone = phone;
	}
	
	public void printDetails() {
		System.out.println("Person Details:\n_________________\n\nFirst Name: " + this.firstName + "\nLast Name: " + this.lastName + "\nGender: " + this.gender + "\nPhone: " + this.phone + "\n");
	}

	public static void main(String[] args) throws BlankNameException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Name:");
		String firstName = sc.nextLine();
		System.out.println("Enter Last Name:");
		String lastName = sc.nextLine();
		try {
			if(firstName.isBlank() | lastName.isBlank()) {
				throw new BlankNameException("Fullname entered is blank..");
			}
		}catch(BlankNameException e) {
			System.out.println("Error:"+e.getMessage());
			return;
		}
		
		System.out.println("Enter Gender (M/F):");
		String genderInput = sc.next().toUpperCase();
		
		while (!genderInput.equals("M") && !genderInput.equals("F")) {
			System.out.println("Invalid gender. Please enter 'M' for Male or 'F' for Female:");
			genderInput = sc.next().toUpperCase();
		}
		
		Gender gender = Gender.valueOf(genderInput);
		
		System.out.println("Enter Phone No:");
		String phone = sc.next();
		
		FullNameValidation p1 = new FullNameValidation(firstName, lastName, gender, phone);
		
		p1.printDetails();

	}

}
