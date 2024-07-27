package inheritence;

import java.util.Scanner;

public class Manager extends Employee {

	private int numberOfEmp;
    private Scanner obj = new Scanner(System.in);

    public void readMgr() {
        System.out.println("Enter the Number of Employees: ");
        numberOfEmp = obj.nextInt();
        obj.nextLine(); // Consume the newline left by nextInt()
    }

    public void disMgr() {
        System.out.println("Number of Employees: " + numberOfEmp);
    }


}
