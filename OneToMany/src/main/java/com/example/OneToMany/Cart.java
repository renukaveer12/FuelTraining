package com.example.OneToMany;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Cart {
	@Id
	private int Cart_id;
	private String uname;
	@OneToMany(mappedBy="Cartobj")
	private Set<Items>item;

public Cart()
{

}


public Cart(int cart_id, String uname) {
	super();
	Cart_id = cart_id;
	this.uname = uname;
	
}


public int getCart_id() {
	return Cart_id;
}

public void setCart_id(int cart_id) {
	Cart_id = cart_id;
}

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public Set<Items> getItem() {
	return item;
}

public void setItem(Set<Items> item) {
	this.item = item;
}

}
