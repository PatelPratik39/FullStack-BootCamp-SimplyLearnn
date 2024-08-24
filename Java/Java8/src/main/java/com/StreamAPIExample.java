package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class MyConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println("Value is " + t);
	}
	
}

public class StreamAPIExample {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		System.out.println(num);
		
		System.out.println("Retrieve element one by one using for each");
		for(int n:num) {
			System.out.println(n);
		}
		Consumer<Integer> cc = new MyConsumer();
		num.forEach(cc);// it takes consumer interface reference. 
		Consumer<Integer> cc1 = (n)->System.out.println("Value using lambda "+n);
		num.forEach(cc1);
		
		
		num.forEach((n) -> System.out.println("Value using Lambda Expression : " + n));
		
	}
}
