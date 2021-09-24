package com.restaurant.springrest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="menu")
public class Menu {
	  @Id
	  @Column(name="itemid")
	  private int ItemId;
	  @Column(name="itemname")
	  String ItemName;
	  @Column(name="itemprice")
	  private int ItemPrice;
	  
	public Menu() {
	}
	public Menu(int ItemId, String ItemName, int ItemPrice) {
		this.ItemId = ItemId;
		this.ItemName = ItemName;
		this.ItemPrice = ItemPrice;
	}
	public int getItemId() {
		return ItemId;
	}
	public void setItemId(int itemId) {
		this.ItemId = itemId;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		this.ItemName = itemName;
	}
	public int getItemPrice() {
		return ItemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.ItemPrice = itemPrice;
	}
	  
}
