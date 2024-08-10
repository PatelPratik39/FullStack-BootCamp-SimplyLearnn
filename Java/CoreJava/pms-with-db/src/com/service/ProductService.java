package com.service;

import java.util.*;

import com.bean.Product;

public class ProductService {
	
	private List<Product> listOfProduct = new ArrayList<>();
	
	public String addProduct(Product product) {
		int flag =0;
		if(listOfProduct.size() == 0) {
			listOfProduct.add(product);	
			return " Product Added Successfully!! ";
		} else {
			Iterator<Product> li = listOfProduct.iterator();
			while(li.hasNext()) {
				Product p = li.next();
				if(p.getPid() == product.getPid()) {
					flag++;
					break;
				}
			}
		}
		if(flag > 0) {
			return " Product id must be unique";
		} else {
			listOfProduct.add(product);
			flag = 0;
			return "Product added successfully" ;
		}
	}
	public String deleteProduct(int pid) {
		int flag =0;	
			Iterator<Product> li = listOfProduct.iterator();
			while(li.hasNext()) {
				Product p = li.next();
				if(p.getPid() == pid) {
					li.remove();
					flag++;
					break;
				}
			}

		if(flag > 0) {
			flag = 0;
			return " Product details remove successfully ";
		} else {
			
			return "Product is not present" ;
		}
	}
	public String updateProduct(Product product) {
		int flag = 0;
		
		Iterator<Product> li = listOfProduct.iterator();
		while(li.hasNext()) {
			Product p = li.next();
			if(p.getPid()==product.getPid()) {
				p.setPrice(product.getPrice());   // new price replace 
				//p.setPrice(p.getPrice()+product.getPrice());
				flag++;
				break;
			}
		}
		if(flag>0) {
			flag =0;
			return "Product price updated successfully";
		}else {
			return "Product not present";
		}
		
	}
	
	public String findPriceById(int pid) {
		int flag=0;

		Iterator<Product> li = listOfProduct.iterator();
		while(li.hasNext()) {
			Product p = li.next();
			if(p.getPid()==pid) {
				flag++;
				return "Your product price is "+p.getPrice();
			}
		}

	if(flag==0) {
		return "Product not preset";
	}

	return null;

	}
	public List<Product> retrieveProduct() {
		return listOfProduct;
	}

}
