package cgg.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {

	public static void main(String[] args) {
		
		try {
			FileReader reader = new FileReader("names.txt");
			FileWriter writer = new FileWriter("output.txt");
			int i;
			while((i=reader.read())!=-1) {
				writer.write(i);
			}
			
			writer.close();
			reader.close();
			
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
