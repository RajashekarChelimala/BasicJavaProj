package labbook;

import java.util.Scanner;

public class PositiveString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String st = sc.nextLine();
		//abc
		int flag=0;
		for(int i=0;i<st.length()-1;i++) {
			if(((int)st.charAt(i))<((int)st.charAt(i+1))){
				flag = flag+1;
			}
			else {
				break;
			}
		}
		if(flag==st.length()-1) {
			System.out.println("Positive String");
		}
		else {
			System.out.println("Negative String");
		}

	}

}
