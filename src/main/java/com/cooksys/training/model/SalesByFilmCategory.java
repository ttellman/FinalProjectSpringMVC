package com.cooksys.training.model;

// Generated May 6, 2014 2:21:07 AM by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * SalesByFilmCategory generated by hbm2java
 */
@Entity
@Table(name = "sales_by_film_category", catalog = "sakila")
public class SalesByFilmCategory implements java.io.Serializable {

	private SalesByFilmCategoryId id;

	public SalesByFilmCategory() {
	}

	public SalesByFilmCategory(SalesByFilmCategoryId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "category", column = @Column(name = "category", nullable = false, length = 25)),
			@AttributeOverride(name = "totalSales", column = @Column(name = "total_sales", precision = 27)) })
	public SalesByFilmCategoryId getId() {
		return this.id;
	}

	public void setId(SalesByFilmCategoryId id) {
		this.id = id;
	}

}
