package com.cooksys.training.cart;
import java.io.Serializable;
import java.util.List;

import com.cooksys.training.beans.ResultBean;

public class ShoppingCart implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numItems = 1;
    private List<ResultBean> items;
    
    
    public List<ResultBean> getItems() {
		return items;
	}

	public void setItems(List<ResultBean> items) {
		this.items = items;
	}

	public void setNumItems(int numItems) {
		this.numItems = numItems;
	}

	public ShoppingCart() {
    }
    
    public int getNumItems() {
        return numItems;
    }
    
    public void addItem() {
        numItems++;
    }
}