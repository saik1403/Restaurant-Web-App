package com.restaurant.springrest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//user class have properties of user that username and user id and user password
@Entity
@Table(name="users")
public class Users {
	@Id
	@Column(name="userid")
	private int userid;
	@Column(name="username")
	String username;
	@Column(name="userpassword")
	String userpassword;
	public Users() {
		
	}
	
	public Users(int userid, String username, String userpassword) {
		this.userid = userid;
		this.username = username;
		this.userpassword = userpassword;
	}

	public int getUserId() {
		return userid;
	}
	public void setUserId(int userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String username) {
		this.username = username;
	}
	public String getUserPassword() {
		return userpassword;
	}
	public void setUserPassword(String password) {
		this.userpassword = password;
	}
	@Override
	public String toString() {
		return "Users [userid=" + userid + ", username=" + username + ", password=" + userpassword + "]";
	}

}

