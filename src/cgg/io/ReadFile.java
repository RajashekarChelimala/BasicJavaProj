package cgg.io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {

	public static void main(String[] args) {
		try {
			Path file=Paths.get("C:\\CGG Internship\\html\\resume.html");
			List<String> lines = Files.readAllLines(file);
			for(String line:lines) {
				System.out.println(line);
			}
			System.out.println("End of File");
		}
		catch(Exception e) {
			
		}

	}
}