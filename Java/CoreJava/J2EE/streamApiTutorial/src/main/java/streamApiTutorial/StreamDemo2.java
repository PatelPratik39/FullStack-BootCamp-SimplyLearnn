package streamApiTutorial;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) {
//		Create ArrayList
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(30);
        marks.add(78);
        marks.add(26);
        marks.add(96);
        marks.add(79);
        System.out.println("Marks for Students " + marks);
        
//        if i want to provide grace marks to student marks??
        
        List<Integer> udatedMarks = marks.stream()
        		.filter(i -> i == 30)
        		.map(i -> i + 6)
        		.collect(Collectors.toList());
        
        System.out.println("Marks of students now : " + udatedMarks);
        

	}

}
