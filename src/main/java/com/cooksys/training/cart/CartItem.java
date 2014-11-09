package com.cooksys.training.cart;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class CartItem {

	String title;
	String rating;
	BigDecimal rentalrate;
	Short length;
	String description;
	String category;
	Short filmId;
	
	public CartItem(){};
	public CartItem(String title, BigDecimal rentalrate, String description, Short filmId)
	{
		this.title =title;
		this.description = description;
		this.filmId = filmId;
		this.rentalrate = rentalrate;
		
	}
		
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public BigDecimal getRentalrate() {
		return rentalrate;
	}
	public void setRentalrate(BigDecimal rentalrate) {
		this.rentalrate = rentalrate;
	}
	public Short getLength() {
		return length;
	}
	public void setLength(Short length) {
		this.length = length;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Short getFilmId() {
		return filmId;
	}
	public void setFilmId(Short filmId) {
		this.filmId = filmId;
	}
}
