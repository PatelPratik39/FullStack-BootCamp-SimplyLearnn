package streamApiTutorial;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> stream = Stream.of("a", "b", "c");
		stream.forEach(System.out::println);
		
		List<String> names = Arrays.asList("John", "Jane", "Jack","Mangoo");
		names.stream().forEach(System.out::println);
		
		/**
		 * Intermediate Operations
		 */
		
//		Filtered Method
		List<String> filtered = names.stream().filter(name -> name.startsWith("J")).collect(Collectors.toList());
		System.out.println("Filtered Stream : " + filtered);
		
//		map()
		List<Integer> mappedMethod = names.stream().map(String::length).collect(Collectors.toList());
		System.out.println(mappedMethod);
		
		/**
		 * Terminal Operations
		 */
		
		List<String> result = names.stream().filter(name -> name.contains("a")).collect(Collectors.toList());
		System.out.println(result);
		
//		forEach loop
		names.stream().forEach(System.out::println);
		
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(30);
        marks.add(78);
        marks.add(26);
        marks.add(96);
        marks.add(79);
        System.out.println("Marks for Students " + marks);
		
//		Filtering and Slicing operation
		List<Integer> evenNum = marks.stream()
									.filter(n -> n % 2 == 0)
									.collect(Collectors.toList());
		System.out.println(evenNum);
		
//		Limit the number
		List<String> firstTwoNames = names.stream().limit(2).collect(Collectors.toList());
		System.out.println(firstTwoNames);
		
		
//		Mapping
		List<String> uppercaseNames = names.stream()
										.map(String:: toUpperCase)
										.collect(Collectors.toList());
		System.out.println(uppercaseNames);
		
//		Finding and Matching
		
//		Optional<String> name = names.stream().findAny();
//		System.out.println(name);
		boolean findName = names.stream().anyMatch(name -> name.startsWith("M"));
		System.out.println(findName);
		
		boolean findName1 = names.stream().anyMatch(name -> name.endsWith("o"));
		System.out.println(findName1);
		

	}

}
