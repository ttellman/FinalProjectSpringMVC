package com.cooksys.training.beans;

import java.util.List;


public class FilmSearch {
	
	private byte category;
	private String title;
	private List<ResultBean> filmSearchList;
	private boolean searched; 
	
	

	

	public byte getCategory() {
		return category;
	}

	public void setCategory(byte category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<ResultBean> getFilmSearchList() {
		return filmSearchList;
	}

	public void setFilmSearchList(List<ResultBean> list) {
		this.filmSearchList = list;
	}

	public boolean isSearched() {
		return searched;
	}

	public void setSearched(boolean searched) {
		this.searched = searched;
	}
}
