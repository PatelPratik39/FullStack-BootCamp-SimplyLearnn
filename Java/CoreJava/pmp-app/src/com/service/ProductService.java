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
	public String deleteProduct(Product pid) {
		return null;
	}
	public String updateProduct(Product product) {
		return null;
	}
	public List<Product> retrieveProduct() {
		return null;
	}

}
