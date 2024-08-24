package streamApiTutorial;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
//		List <String> names = Arrays.asList("John", "Jane", "Jack");
//		names.stream().forEach(System.out::println);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(2);
        al.add(6);
        al.add(9);
        al.add(4);
        al.add(20);
        
        System.out.println("Printing the collection : " + al);
        System.out.println();
        
        List<Integer> ls = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        //above method
//         stream() = stream the data from collection
//        filter() = filter the data from the stream
//        collect() = that collect the list from filter ans return the data as list of Collectors
        
        System.out.println("Printing the list after stream operation : " + ls);

	}

}
