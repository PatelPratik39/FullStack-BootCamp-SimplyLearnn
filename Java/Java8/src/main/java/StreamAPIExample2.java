//import java.util.ArrayList;
import java.util.*;

public class StreamAPIExample2 {

	public static void main(String[] args) {
//		List<String> names = new ArrayList<String>();
//		names.add("Ravi");names.add("Ajay");names.add("Stevena");names.add("Mahesh");names.add("Johna");
//		names.add("Raju");names.add("Vijay");names.add("Reeta");names.add("Leena");names.add("Ramu");
//		
//		names.forEach(v -> System.out.println(v));
//		System.out.println();
//		names.stream().map(v -> v.toUpperCase()).forEach( v -> System.out.println(v));
//		System.out.println();
//		
//		names.stream().filter(v->v.contains("na")).forEach(v->System.out.println(v));
//		System.out.println();
//		names.stream().filter(v->v.contains("ee")).map(v->"Welcome user "+v).forEach(v->System.out.println(v));
//		System.out.println();
//		boolean result1 = names.stream().anyMatch(v->v.startsWith("P"));
//		System.out.println(result1);
//		System.out.println();
//		boolean result2 = names.stream().allMatch(v->v.contains("a"));
//		System.out.println(result2);
		
		List<Integer> ll = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum = ll.stream().reduce(0, (ival,curval)->ival+curval);
		int sumofeven = ll.stream().filter(f->f%2==0).reduce(0, (ival,curval)->ival+curval);
//		int sum = ll.stream().reduce(0, (ival,curval)->{
//			System.out.println("ival "+ival+" cval "+curval);
//			return ival+curval;
//		});
		System.out.println(sum);
		System.out.println(sumofeven);
		

	}

}
