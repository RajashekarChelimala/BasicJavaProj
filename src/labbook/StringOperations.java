package labbook;
import java.util.*;

public class StringOperations {
	
	public static void main(String[] args) {
		
//		Add the String to itself
//		Replace odd positions with #
//		Remove duplicate characters in the String
//		Change odd characters to upper case
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String:");
		String str = sc.nextLine();
		
		System.out.print("Enter the Your Choice: \n1.Add String to itself \n2.Replace Odd Positions with #\n3.Remove Duplicates \n4.Change Odd Char to Upper Case\n");
		int choice = sc.nextInt();
		
		switch(choice) {
		
			case 1:{
				System.out.println(str+str);
				break;
			}
			
			case 2:{
				String dup_str="";
				char hash='#'; 
				for(int i=0;i<str.length();i++) {
					if(i%2==0) {
						dup_str=dup_str+str.charAt(i);
					}
					else {
						dup_str=dup_str+hash;
					}
				}
				System.out.println(dup_str);
				break;
			}
			
			case 3:{
				
				String free_dup="";
				String storage_str="";
				for(int i=0;i<str.length();i++) {
					if(storage_str.indexOf(str.charAt(i))==-1) {
						storage_str=storage_str+str.charAt(i);
						free_dup=free_dup+str.charAt(i);
					}
				}
				System.out.println(storage_str);
//				System.out.println(free_dup);
				break;
				
			}
			
			case 4:{
				
				String dup_str="";
				for(int i=0;i<str.length();i++) {
					if(i%2==0) {
						dup_str=dup_str+str.charAt(i);
					}
					else {
						dup_str=dup_str+Character.toUpperCase(str.charAt(i));
					}
				}
				System.out.println(dup_str);
				break;
			}
			
		}
		

	}

}
