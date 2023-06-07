package collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		Hashtable<String, Double> balance = new Hashtable<>();
		balance.put("ABC", 5000.0);
		balance.put("PQR", 10000.0);
		balance.put("GHI", 8000.0);
		
		System.out.println(balance);
		System.out.println("-----------------------");
		
		Enumeration<String> keys = balance.keys();
		while(keys.hasMoreElements()) {
			String ele = keys.nextElement();
			System.out.println(ele+"=>"+balance.get(ele));
		}
		
		double val = balance.get("PQR");
		double newVal = val+2000;
		balance.put("PQR", newVal);
		System.out.println(balance.get("PQR"));
		
		System.out.println("-----------FOR EACH-------------");
		balance.forEach((k,v)->System.out.println(k+"=>"+v));
		
	}

}
