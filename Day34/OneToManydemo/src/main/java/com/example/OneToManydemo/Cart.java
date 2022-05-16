package com.example.OneToManydemo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cart {
	
	@Id
	private int cart_id;
	@Column
	private String Uname;
	public Cart() {
		
	}
	
	@OneToMany(mappedBy = "cart_obj")
	private Set<Items>items ;
	
	public int getCart_id() {
		return cart_id;
	}


	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}


	public String getUname() {
		return Uname;
	}


	public void setUname(String uname) {
		Uname = uname;
	}


	public Cart(int cart_id, String uname) {
		super();
		this.cart_id = cart_id;
		Uname = uname;
	}
	
	
	

}
