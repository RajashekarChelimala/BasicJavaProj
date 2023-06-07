package labbook;
import java.util.*;

public class PersonDetails {
	
	String firstName;
	String lastName;
	String gender;
	String phone;

	public PersonDetails(String firstName, String lastName, String gender, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phone = phone;
	}
	
	public void printDetails() {
		System.out.println("Person Details:\n_________________\n\nFirst Name:"+this.firstName+"\nLast Name:"+this.lastName+"\nGender:"+this.gender+"\nGender:"+this.phone+"\n");
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Name:");
		String firstName=sc.next();
		System.out.println("Enter Second Name:");
		String lastName=sc.next();
		System.out.println("Enter Gender:");
		String gender=sc.next();
		System.out.println("Enter PhoneNo:");
		String phone=sc.next();
		
		PersonDetails p1=new PersonDetails(firstName,lastName,gender,phone);
		
		p1.printDetails();

	}

}
