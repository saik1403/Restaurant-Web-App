package com.restaurant.springrest.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="admins")
public class Admins {
	@Id
	@Column(name="adminid")
	private int adminid;
	@Column(name="adminname")
	private String adminname;
	@Column(name="adminpassword")
	private String adminpassword;
	public Admins() {
	}
	public Admins(int adminid, String adminname, String adminpassword) {
		this.adminid = adminid;
		this.adminname = adminname;
		this.adminpassword = adminpassword;
	}
	@Override
	public String toString() {
		return "Admin [adminid=" + adminid + ", adminname=" + adminname + ", adminpassword=" + adminpassword + "]";
	}
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getAdminpassword() {
		return adminpassword;
	}
	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}
}
