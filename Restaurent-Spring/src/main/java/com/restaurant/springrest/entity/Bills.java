package com.restaurant.springrest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bills")
public class Bills {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="billid")
	private int billid;
	@Column(name="billdate")
	String billdate;
	@Column(name="itemid")
	private int itemid;
	@Column(name="totalprice")
	private int totalprice;
	@Column(name="userid")
	private int userid;
	@Column(name="username")
	String username;
	public Bills(int billid, String billdate, int itemid, int totalprice, int userid, String username) {
		this.billid = billid;
		this.billdate = billdate;
		this.itemid = itemid;
		this.totalprice = totalprice;
		this.userid = userid;
		this.username = username;
	}
	public Bills() {
	}
	public int getBillid() {
		return billid;
	}
	public void setBillid(int billid) {
		this.billid = billid;
	}
	public String getBilldate() {
		return billdate;
	}
	public void setBilldate(String billdate) {
		this.billdate = billdate;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "Bills [billid=" + billid + ", billdate=" + billdate + ", itemid=" + itemid + ", totalprice="
				+ totalprice + ", userid=" + userid + ", username=" + username + "]";
	}
	
	
	
	
	

}
