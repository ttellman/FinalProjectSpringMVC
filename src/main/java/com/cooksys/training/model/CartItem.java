package com.cooksys.training.model;

import java.util.List;

import com.cooksys.training.beans.ResultBean;

public class CartItem {
	
	private List<ResultBean> cartitems;
	private double total;
	private int itemCount;
	
	
	public List<ResultBean> getCartitems() {
		return cartitems;
	}
	public void setCartitems(List<ResultBean> cartitems) {
		this.cartitems = cartitems;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	
	
}
