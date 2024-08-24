import java.util.ArrayList;
import java.util.List;

public class StreamAPIExample1 {

    public static void main(String[] args) {
        // Create and populate a list of integers
        List<Integer> num = new ArrayList<Integer>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);

        // Print the original list
        System.out.println("Original list:");
        num.forEach(v -> System.out.println(v));
        System.out.println();

        // Print each element using streams and forEach
        System.out.println("Using stream and forEach:");
        num.stream().forEach(v -> System.out.println(v));
        System.out.println();

        // Map each element by adding 12 and then print the result
        System.out.println("After adding 12 to each element:");
        num.stream().map(v -> v + 12).forEach(v -> System.out.println(v));
        System.out.println();

        // Filter even numbers and print them
        System.out.println("Even numbers:");
        num.stream().filter(v -> v % 2 == 0).forEach(v -> System.out.println(v));
        System.out.println();

        // Filter odd numbers and print them
        System.out.println("Odd numbers:");
        num.stream().filter(v -> v % 2 != 0).forEach(v -> System.out.println(v));
        
        num.stream().anyMatch(v -> v.equals(v % 20 ==0));
    }
}
