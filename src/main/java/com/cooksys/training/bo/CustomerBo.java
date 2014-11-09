package com.cooksys.training.bo;

import java.util.List;

import com.cooksys.training.beans.CustomerBean;
import com.cooksys.training.beans.RentalBean;

public interface CustomerBo {
	
	
	public List<CustomerBean> findCustomer(String username);
	public List<RentalBean> getRentalHistory(String username);
	

}
