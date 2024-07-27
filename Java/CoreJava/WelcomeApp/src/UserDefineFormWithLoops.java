import java.util.Scanner;

public class UserDefineFormWithLoops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Records need to be stored :  ");
		int n = sc.nextInt();
		int id[] = new int[n];
		String names[] = new String[n];
		float salary[] = new float[n];
		String desg[] = new String[n];
		System.out.println("Enter each employee records one by ine by User input ");
		
		for(int i=0; i< n; i++) {
			System.out.println("Enter ID : ");
			id[i] = sc.nextInt();
			System.out.println("Enter Name : ");
			names[i] = sc.next();
			System.out.println("Enter Salary ");
			salary[i] = sc.nextFloat();
			System.out.println("Enter Designation ");
			desg[i] = sc.next();
		}
//		bussiness logic
		for(int i=0; i<n; i++) {
			if(desg[i].equalsIgnoreCase("Manager")) {
				salary[i] = salary[i] + 5000;
			} else if(desg[i].equalsIgnoreCase("Tester")) {
				salary[i] = salary[i]+ 3000;
			} else {
				salary[i] = salary[i]+1500;
			}
		}
		System.out.println("All Employee Records are : ");
		
		for(int i =0; i<n; i++) {
			System.out.println("id is "+id[i]+" Name is "+names[i]+" Salary is "+salary[i]+" Designation is "+desg[i]);
		}
		
	}

}
