package encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee();
		emp1.id = 100;
		emp1.name = "Lasan";
		emp1.salary = 35000;
		emp1.setValue(100, "Lasan", 36000);
		emp1.display();

	}

}
