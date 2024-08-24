package coms;

@FunctionalInterface
interface Operation {
	public int add(int x, int y);
}

@FunctionalInterface
interface Info{
	public void greeting(String name);
}

public class LambdaOperation {
	public static void main(String[] args) {
		Operation opt1 = (x, y) -> x + y;
		System.out.println("addition " + opt1.add(100, 200));
		
		Operation opt2 = (a,b) -> a - b;
		System.out.println("Subtraction " + opt2.add(10,20));
		
		Operation opt3 = ( m, n) -> {
			int add = m + n;
			return add;
		};
		System.out.println("Addition " + opt3.add(1000,2000));
		
		
		Info obj1 = (name) -> System.out.println("Welcome User " + name);
		obj1.greeting("MaganLal");
		
		Info obj2 = (var name) -> {
			System.out.println("Welcome user with multi line statmenmt " + name);
		};
		obj2.greeting("Mangoo");
		var a = 10;   //Declaring generic type of variable.
//		a = "Lasanlala";
		
	}

}
