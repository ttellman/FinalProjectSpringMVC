/**
 * 
 */
package com.cooksys.training.dao;

import java.util.List;
import java.util.Map;

import com.cooksys.training.beans.ResultBean;
import com.cooksys.training.model.Customer;


/**
 * @author Cooksys Teacher
 *	May 14, 2013 2:16:29 PM
 * 
 * @Copyright This code is intellectual property of 
 * CookSystems International. 2013
 */
public interface FilmDao {
	
	public List<ResultBean> searchByTitle(String title);
	public long getCheckoutCount(Short filmId);
	public long getAvailableCount(Short filmId);
	public Map<Byte, String> getCategory();
	//public List<ResultBean> searchByBoth(Byte category, String title);
	public List<ResultBean> searchFilms(Byte category, String title);
	public List<String> findCategory();
	public List<Customer> searchUsername(String username);
	public List<ResultBean> searchByCategory(String category);
	
	
}
