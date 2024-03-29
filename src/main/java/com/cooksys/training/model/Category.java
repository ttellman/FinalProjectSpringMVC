package com.cooksys.training.model;

// Generated May 6, 2014 2:21:07 AM by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Category generated by hbm2java
 */
@Entity
@Table(name = "category", catalog = "sakila")
public class Category implements java.io.Serializable {

	private Byte categoryId;
	private String name;
	private Date lastUpdate;
	private Set<FilmCategory> filmCategories = new HashSet<FilmCategory>(0);

	public Category() {
	}

	public Category(String name, Date lastUpdate) {
		this.name = name;
		this.lastUpdate = lastUpdate;
	}

	public Category(String name, Date lastUpdate,
			Set<FilmCategory> filmCategories) {
		this.name = name;
		this.lastUpdate = lastUpdate;
		this.filmCategories = filmCategories;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "category_id", unique = true, nullable = false)
	public Byte getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Byte categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "name", nullable = false, length = 25)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_update", nullable = false, length = 19)
	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	public Set<FilmCategory> getFilmCategories() {
		return this.filmCategories;
	}

	public void setFilmCategories(Set<FilmCategory> filmCategories) {
		this.filmCategories = filmCategories;
	}

}
