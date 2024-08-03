package main;
import java.util.List;
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
		String confirmation;
		String result;
		do {
			System.out.println("1 :  Add Product");
			System.out.println("Please Enter Your choice");
			choice = sc.nextInt();
			switch(choice) {
				case 1 : 
					System.out.println("Please Enter the product Id ");
					pid = sc.nextInt();
					System.out.println("Please Enter the product Name ");
					pName = sc.next();
					System.out.println("Please Enter the product Price ");
					price = sc.nextFloat();
					Product p = new Product(pid, pName,price);
					result = ps.addProduct(p);
					System.out.println(result);
				break;
					
				case 2 : 
					System.out.println("Please Enter the Product Id for DELETE ");
					pid = sc.nextInt();
					result = ps.deleteProduct(pid);
					System.out.println(result);
				break;
					
				case 3: 
					System.out.println("Please Enter the Product Id for UPDATE the Price ");
					pid = sc.nextInt();
					System.out.println("Please enter the new product price");
					price = sc.nextFloat();
					Product p1 = new Product();
					p1.setPid(pid);
					p1.setPrice(price);
					result = ps.updateProduct(p1);
				    System.out.println(result);
			      break;
				case 4:
					System.out.println("Plz enter the product id to find the price");
					pid = sc.nextInt();
					result = ps.findPriceById(pid);
					System.out.println(result);
				break;
				case 5:
					System.out.println("All Product info");
					List<Product> listOfProducts = ps.retrieveProduct();
					for(Product product:listOfProducts) {
						System.out.println("Pid "+product.getPid()+" PName "+product.getpName()+" Price "+product.getPrice());
//						System.out.println(product);
					}
					break;
			default:System.out.println("Wrong choice");
				break;
			}
			System.out.println("Do you want to continue??");
			confirmation = sc.next();
		} while (confirmation.equalsIgnoreCase("y"));
			System.out.println("Thank You!!!!");

	}

}
