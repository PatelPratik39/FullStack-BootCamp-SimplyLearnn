package inheritence;

import java.util.Scanner;

public class Employee {
	private int id;
	private String name;
	private float salary;
	Scanner obj = new Scanner(System.in);
	
	public void readEmp() {
		System.out.println("enter the Id ");
		id= obj.nextInt();
		obj.nextLine();
		System.out.println("enter the Name ");
		name = obj.next();
		System.out.println("Enter the Salary ");
		salary = obj.nextFloat();
	}
//	business Logic
	
	public void disEmp() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}

}
