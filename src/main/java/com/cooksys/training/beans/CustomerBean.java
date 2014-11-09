package com.cooksys.training.beans;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cooksys.training.model.Customer;


public class CustomerBean {

	
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private Byte storeId;
	private List<Customer> userList;
	
	public CustomerBean(){};
	
	 /**
	 * @param username
	 * @param password
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param storeId
	 */
	public CustomerBean(String firstName, String lastName, String email,
			Byte storeId, String username, String password) {
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.storeId = storeId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Byte getStoreId() {
		return storeId;
	}
	public void setStoreId(Byte storeId) {
		this.storeId = storeId;
	}

	public List<Customer> getUserList() {
		return userList;
	}

	public void setUserList(List<Customer> userList) {
		this.userList = userList;
	}
}
