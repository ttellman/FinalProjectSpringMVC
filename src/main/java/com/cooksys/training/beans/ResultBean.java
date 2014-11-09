package com.cooksys.training.beans;

import java.io.Serializable;
import java.math.BigDecimal;

public class ResultBean implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	String title;
	String rating;
	BigDecimal rentalrate;
	Short length;
	String description;
	String category;
	Short filmId;
	
	
	

	public ResultBean(){
		
	}
	
	public ResultBean(Short filmId, String title, String rating, BigDecimal rentalrate,
			Short length, String description, String category) {
		this.filmId = filmId;
		this.title = title;
		this.rating = rating;
		this.rentalrate = rentalrate;
		this.length = length;
		this.description = description;
		this.category = category;
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

	public void setFilmID(Short filmId) {
		this.filmId = filmId;
	}

}
