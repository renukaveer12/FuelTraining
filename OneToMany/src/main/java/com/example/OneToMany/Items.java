package com.example.OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Items {
@Id
int item_id;
String item_desc;
int item_cost;
@ManyToMany
@JoinColumn(name="cart_id")
private Cart CartObj;
public Items()
{
	
}
public Items(int item_id, String item_desc, int item_cost, Cart cartObj) {
	super();
	this.item_id = item_id;
	this.item_desc = item_desc;
	this.item_cost = item_cost;
	CartObj = cartObj;
}
public int getItem_id() {
	return item_id;
}
public void setItem_id(int item_id) {
	this.item_id = item_id;
}
public String getItem_desc() {
	return item_desc;
}
public void setItem_desc(String item_desc) {
	this.item_desc = item_desc;
}
public int getItem_cost() {
	return item_cost;
}
public void setItem_cost(int item_cost) {
	this.item_cost = item_cost;
}
public Cart getCartObj() {
	return CartObj;
}
public void setCartObj(Cart cartObj) {
	CartObj = cartObj;
}  

}
