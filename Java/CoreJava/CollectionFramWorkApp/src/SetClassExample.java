import java.util.*;

public class SetClassExample {

	public static void main(String[] args) {
		//HashSet hs = new HashSet();
		  // run time polymorphism, create object of 
								// sub class and super class reference it can be 
								// class or interface or abstract class. 
//		// HashSet 
//		Set ss1 = new HashSet(); 
//		System.out.println("size "+ss1.size());
//		System.out.println("empty "+ss1.isEmpty());
//		ss1.add(4);
//		ss1.add(1);
//		ss1.add(6);
//		ss1.add(9);
//		ss1.add(4);
//		System.out.println(ss1);
//		System.out.println("size "+ss1.size());
//		System.out.println("empty "+ss1.isEmpty());
//		System.out.println("Remove "+ss1.remove(6));
//		System.out.println("Remove "+ss1.remove(10));
//		System.out.println(ss1);
//		System.out.println("search "+ss1.contains(4));
//		System.out.println("search "+ss1.contains(40));
//		ss1.clear();
//		System.out.println("size "+ss1.size());
//		System.out.println("empty "+ss1.isEmpty());
		
//		// LinkedHashSet 
//				Set ss1 = new LinkedHashSet(); 
//				System.out.println("size "+ss1.size());
//				System.out.println("empty "+ss1.isEmpty());
//				ss1.add(4);
//				ss1.add(1);
//				ss1.add(6);
//				ss1.add(9);
//				ss1.add(4);
//				System.out.println(ss1);
//				System.out.println("size "+ss1.size());
//				System.out.println("empty "+ss1.isEmpty());
//				System.out.println("Remove "+ss1.remove(6));
//				System.out.println("Remove "+ss1.remove(10));
//				System.out.println(ss1);
//				System.out.println("search "+ss1.contains(4));
//				System.out.println("search "+ss1.contains(40));
//				ss1.clear();
//				System.out.println("size "+ss1.size());
//				System.out.println("empty "+ss1.isEmpty());
		
		// TreeSet 
		//Set ss1 = new TreeSet(); 
		SortedSet ss1 = new TreeSet();
		System.out.println("size "+ss1.size());
		System.out.println("empty "+ss1.isEmpty());
		ss1.add(4);
		ss1.add(1);
		//ss1.add(10.10);
		ss1.add(6);
		ss1.add(9);
		ss1.add(4);
		System.out.println("head set"+ss1.headSet(6));
		System.out.println("tail set"+ss1.tailSet(6));
		System.out.println(ss1);
		System.out.println("size "+ss1.size());
		System.out.println("empty "+ss1.isEmpty());
		System.out.println("Remove "+ss1.remove(6));
		System.out.println("Remove "+ss1.remove(10));
		System.out.println(ss1);
		System.out.println("search "+ss1.contains(4));
		System.out.println("search "+ss1.contains(40));
		ss1.clear();
		System.out.println("size "+ss1.size());
		System.out.println("empty "+ss1.isEmpty());

	}

}
