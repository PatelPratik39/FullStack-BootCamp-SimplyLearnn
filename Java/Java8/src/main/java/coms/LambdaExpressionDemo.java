package coms;


interface Hello {
	public String sayHello();
}

class HelloImpl implements Hello{
	
	@Override
	public String sayHello() {
		return "Welcome using Hello IMPL Class using Java 6 feature";
	}
}

public class LambdaExpressionDemo {
	public static void main(String[] args) {
		Hello obj1 = new HelloImpl();
		System.out.println(obj1.sayHello());  //first option
		
		Hello obj2 = new Hello() {
			@Override
			public String sayHello() {
				hello();
				return "Welcome using Hello anonymous inner Class";
			}
			public void hello() {
				 System.out.println("Hello method of annonymous class");
			}
		};
		System.out.println(obj2.sayHello());
		
		Hello obj3 = new Hello() {
			@Override
			public String sayHello() {
				hello();
				return "Welcome using Hello anonymous inner Class 2nd WAY";
			}
			public void hello() {
				 System.out.println("Hello method of annonymous class");
			}
		};
		System.out.println(obj3.sayHello());
		
//		3rd using Lambda Expression style
		Hello obj4 = () -> "Welcome using Lambda expression";
		System.out.println(obj4.sayHello());
	}

}
