package com.example.OneToManydemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Items {
	
	@Id
	private int item_id;
	private String item_des;
	private int item_cost;
	
	
	@ManyToOne
	@JoinColumn(name="cart_id")
	private Cart cart_obj;
	
	

	public Items() {
		
	}


	public int getItem_id() {
		return item_id;
	}


	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}


	public String getItem_des() {
		return item_des;
	}


	public void setItem_des(String item_des) {
		this.item_des = item_des;
	}


	public int getItem_cost() {
		return item_cost;
	}


	public void setItem_cost(int item_cost) {
		this.item_cost = item_cost;
	}


	public Cart getCart_obj() {
		return cart_obj;
	}


	public void setCart_obj(Cart cart_obj) {
		this.cart_obj = cart_obj;
	}


	public Items(int item_id, String item_des, int item_cost, Cart cart_obj) {
		super();
		this.item_id = item_id;
		this.item_des = item_des;
		this.item_cost = item_cost;
		this.cart_obj = cart_obj;
	}
	
	
	

}
