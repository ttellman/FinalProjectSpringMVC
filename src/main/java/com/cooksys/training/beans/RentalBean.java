package com.cooksys.training.beans;

import java.util.Date;

public class RentalBean {
	
	private int rentalId;
	private short filmId;
	private String title;
	private Date rentalDate;
	private Date returnDate;
	private short customerId;
	private String username;
	private int inventoryId;
	private byte storeId;
	
	
	public RentalBean(){};
	
	
	public RentalBean(int rentalId, short filmId, String title, byte storeId, int inventoryId, short customerId,
			String username, Date rentalDate, Date returnDate) {
		
		this.rentalId = rentalId;
		this.filmId = filmId;
		this.title = title;
		this.storeId = storeId;
		this.rentalDate = rentalDate; 
		this.returnDate = returnDate;
		this.customerId = customerId;
		this.username = username;
		this.inventoryId = inventoryId;
	}
	
	
	public int getRentalId() {
		return rentalId;
	}
	public void setRentalId(int rentalId) {
		this.rentalId = rentalId;
	}
	public short getFilmId() {
		return filmId;
	}
	public void setFilmId(short filmId) {
		this.filmId = filmId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getRentalDate() {
		return rentalDate;
	}
	public void setRentalDate(Date rentalDate) {
		this.rentalDate = rentalDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public short getCustomerId() {
		return customerId;
	}
	public void setCustomerId(short customerId) {
		this.customerId = customerId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}


	public byte getStoreId() {
		return storeId;
	}


	public void setStoreId(byte storeId) {
		this.storeId = storeId;
	}
	
	
	
	

}
