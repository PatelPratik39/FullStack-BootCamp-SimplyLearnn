package com;

class Test implements InterfaceDemo {

    @Override
    public void dis1() {
        System.out.println("Test class provided body for dis1 method");
    }

    @Override
    public void dis2() {
        System.out.println("Overrided default method");
    }

    static void dis4() {
        System.out.println("dis4 static method in Test class");
    }
}

public class InterfceExample {
	public static void main(String[] args) {
		
		Test t1 = new Test();
        t1.dis1(); // Calls the overridden method in Test class
        t1.dis2(); // Calls the overridden method in Test class
        t1.dis3(); // Calls the default method from the interface
        
        // Static method should be called using the class/interface name
        InterfaceDemo.dis4(); // Calls the static method from the interface
        Test.dis4(); // Calls the static method from the Test class
		
	}

}
