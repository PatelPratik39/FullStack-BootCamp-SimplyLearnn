import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class EmployeeTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("employee.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Employee emp2 = (Employee)obj;
		System.out.println("id is "+emp2.getId());
		System.out.println("name is "+emp2.getName());
		System.out.println("salary is "+emp2.getSalary());
		if(obj instanceof Employee) {
			System.out.println("yes");
		}
	}

}
