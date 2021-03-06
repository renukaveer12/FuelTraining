package com.example.OneToManydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OneToManydemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext context;
		context = SpringApplication.run(OneToManydemoApplication.class, args);
		
		CartRepository cart = context.getBean(CartRepository.class);
		ItemsRepository item = context.getBean(ItemsRepository.class);
		
		Cart c1 = new Cart(1,"abc");
		cart.save(c1);
		
		Items i1 = new Items(100,"keyboard",500,c1);
		item.save(i1);
		System.out.println("Successfully record Save !");
	}

}
