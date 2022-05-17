package com.example.OneToMany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OneToManyApplication {

	public static void main(String[] args) {
	    ApplicationContext context=SpringApplication.run(OneToManyApplication.class, args);
		CartRepository cart;
		cart=context.getBean(CartRepository.class);
		ItemRepository item;
		item=context.getBean(ItemRepository.class);
		
		Cart c1=new Cart(1,"Ranii");
		cart.save(c1);
		
		Items i1=new Items(1,"Mouse",200 ,c1);
		item.save(i1);
		
		Items i2=new Items(2,"Keyboard", 400 ,c1);
		item.save(i2);
	}
}

		
	
