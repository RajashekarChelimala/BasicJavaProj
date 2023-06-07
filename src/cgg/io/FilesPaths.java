package cgg.io;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesPaths {

	public static void main(String[] args) {
		try {
			Path path = Paths.get("C:\\CGG Internship\\html");
			DirectoryStream<Path> contents = Files.newDirectoryStream(path);
			for(Path content: contents) {
				System.out.println(content.getFileName());
			}
		}
		catch(Exception e) {
			
		}
	}
}