package encapsulation;

public class Employee {
	int id;
	String name;
	float salary;
	
	void setValue(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		if(salary < 0) {
			this.salary = 12000;
		}else {
			this.salary = salary;
		}
	}
	void display() {
		System.out.println("Id is " + id);
		System.out.println("Name is " + name);
		System.out.println("Salary is " + salary);
	}

}
