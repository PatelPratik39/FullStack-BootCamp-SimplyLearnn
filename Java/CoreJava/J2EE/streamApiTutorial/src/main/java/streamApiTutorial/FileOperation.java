package streamApiTutorial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileOperation {
	
	private static List<String> filtredAndConvertTouppercase(Stream<String> stream, int length) {
		
		return stream.filter(s -> s.length() == length).map(String :: toUpperCase).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		String fileName = "/Users/pratikpatel/Desktop/file.docx";
//		create streamline of lines from the file
		try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
			List<String> filteredStrings = filtredAndConvertTouppercase(lines, 5);
			System.out.println(
	                "Filtered strings with length 5 (converted to uppercase): "
	                + filteredStrings);
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

	

}
