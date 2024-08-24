import java.util.ArrayList;
import java.util.List;

public class StreamAPIExample2 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ravi");names.add("Ajay");names.add("Stevena");names.add("Mahesh");names.add("Johna");
		names.add("Raju");names.add("Vijay");names.add("Reeta");names.add("Leena");names.add("Ramu");
		
		names.forEach(v -> System.out.println(v));
		System.out.println();
		names.stream().map(v -> v.toUpperCase()).forEach( v -> System.out.println(v));
		System.out.println();
		
		names.stream().filter(v->v.contains("na")).forEach(v->System.out.println(v));
		System.out.println();
		names.stream().filter(v->v.contains("ee")).map(v->"Welcome user "+v).forEach(v->System.out.println(v));
		System.out.println();
		boolean result1 = names.stream().anyMatch(v->v.startsWith("P"));
		System.out.println(result1);
		System.out.println();
		boolean result2 = names.stream().allMatch(v->v.contains("a"));
		System.out.println(result2);
		

	}

}
