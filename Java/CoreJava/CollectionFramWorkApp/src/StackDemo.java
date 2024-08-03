import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack ss = new Stack();
		ss.push(100);
		ss.push(200);
		ss.push(300);
		System.out.println(ss);
		System.out.println("Pop "+ss.pop());		// remove top element 
		System.out.println(ss);
		System.out.println("Peek "+ss.peek());		// it display top element 
		System.out.println(ss);
		System.out.println("Search "+ss.search(100));
		System.out.println("Search "+ss.search(1000));
		

	}

}
