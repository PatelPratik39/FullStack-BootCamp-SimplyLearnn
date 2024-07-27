package inheritence;

public class EmployeeTest {

	public static void main(String[] args) {
		System.out.println("Generic employee information");
		Employee emp = new Employee();
		emp.readEmp();
		emp.disEmp();
		
		System.out.println("-----------------------------");
		
		System.out.println("Manager Information");
		
		Manager mgr = new Manager();
		mgr.readEmp();// id,name,salary
		mgr.readMgr();	// numberofemp
		
		mgr.disEmp();		// id,name,salary
		mgr.disMgr();		// numberofemp


	}

}
