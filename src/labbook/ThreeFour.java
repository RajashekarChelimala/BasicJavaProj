package labbook;
import java.util.*;

public class ThreeFour {
public static void main(String[] args) {	
    ArrayList<String> s = new ArrayList<>();
    s.add("farooq");
    s.add("rajashekar");
    s.add("vamshi");
    Collections.sort(s,new ComparatorExample());
    for(String i:s) {
    	System.out.println(i);
    }
    
}
}
