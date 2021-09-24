package com.restaurant.springrest.entity;

import org.springframework.stereotype.Component;

@Component
public class Order {
	
	private int itemid;
	int quantity;
	Order(){
	}
	Order(int itemid,int quantity){
		this.setItemid(itemid);
		this.quantity=quantity;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
