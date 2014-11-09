/**
 * 
 */
package com.cooksys.training.bo;

import java.util.List;
import java.util.Map;

import com.cooksys.training.beans.ResultBean;
import com.cooksys.training.model.Film;

/**
 * @author Cooksys Teacher
 *	May 14, 2013 2:06:28 PM
 * 
 * @Copyright This code is intellectual property of 
 * CookSystems International. 2013
 */
public interface FilmBo {

	public List<ResultBean> searchByTitle(String title);
	public long getCheckoutCount(Short filmId);
	public long getAvailableCount(Short filmId);
	
	
}
