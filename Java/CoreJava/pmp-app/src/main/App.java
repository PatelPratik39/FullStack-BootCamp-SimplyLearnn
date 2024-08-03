package main;
import java.util.Scanner;

import com.bean.Product;
import com.service.ProductService;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ProductService ps = new ProductService();
		int choice;
		int pid;
		String pName;
		float price;
		String con;
		String result;
		do {
			System.out.println("1 :  Add Product");
			System.out.println("Please Enter Your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : System.out.println("Please Enter the product Id ");
			pid = sc.nextInt();
			System.out.println("Please Enter the product Name ");
			pName = sc.next();
			System.out.println("Please Enter the product Price ");
			price = sc.nextFloat();
			Product p = new Product(pid, pName,price);
			result = ps.addProduct(p);
			System.out.println(result);
			break;
			default:System.out.println("Wrong choice");
			break;
			}
			System.out.println("Do you want to continue??");
			con = sc.next();
		} while (con.equalsIgnoreCase("y"));
			System.out.println("Thank You!!!!");

	}

}
