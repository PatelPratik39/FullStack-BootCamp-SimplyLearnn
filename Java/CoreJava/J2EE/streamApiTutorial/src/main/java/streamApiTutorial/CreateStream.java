package streamApiTutorial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
		
//		Reducing
		
		int sum = marks.stream().reduce(0, Integer:: sum);
		System.out.println(sum);
		
//		Collecting results
		List<String> list = names.stream().collect(Collectors.toList());
		System.out.println(list);
		Set<String> set = names.stream().collect(Collectors.toSet());
		System.out.println(set);

//		Grouping and Partitioning
		Map<Integer , List<String>> groupedByLength = names.stream().collect(Collectors.groupingBy(String :: length));
		System.out.println(groupedByLength);
		System.out.println();
		
		Map<Boolean, List<String>> partitioned = names.stream().collect(Collectors.partitioningBy(name -> name.length() > 4));
		System.out.println(partitioned);
		System.out.println();
		
		/**
		 *  11. Parallel Stream
		 */
		
		List<String> uppercaseName = names.parallelStream().map(String :: toUpperCase).collect(Collectors.toList());
		System.out.println(uppercaseName);
		
		/**
		 *  12. Primitive Streams
		 */
		
		List<Integer> num = IntStream.range(1, 5).boxed().collect(Collectors.toList());
		System.out.println(num);
		
		/**
		 * 13.  Working with Files using Streams
		 */
		
//		try(Stream<String> lines = Files.lines(Paths.get("file.txt"))){
//			lines.forEach(System.out::println);
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
//		
		/**
		 * 14. Error handling in Streams
		 */
		List<Integer> numbers = Arrays.asList(1,2,88,12,16,29,3,4,5,6,7,8,9);
		
		List<Integer> result1 = numbers.stream().map(n -> {
			try {
				return 10 / n;
			} catch(ArithmeticException e) {
				return 0;
			}
		}).collect(Collectors.toList());
		
		System.out.println(result1);

		
	}

}
