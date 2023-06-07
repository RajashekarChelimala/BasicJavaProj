package labbook;
import java.util.*;

public class PositiveNegative {

	public static void main(String[] args) {
		//Write a program to accept a number from user as a command line argument and check 
		//whether the given number is positive or negative number.
		
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		if(n>0) {
			System.out.println("Positive Number");
		}
		else if(n<0) {
			System.out.println("Negative Number");
		}
		else {
			System.out.println("Zeroo");
		}
		sc.close();
	}

}
