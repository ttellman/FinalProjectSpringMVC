/**
 * 
 */
package com.cooksys.training.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cooksys.training.beans.ResultBean;
import com.cooksys.training.bo.FilmBo;
import com.cooksys.training.dao.FilmDao;
import com.cooksys.training.model.Film;

/**
 * @author Cooksys Teacher
 *	May 14, 2013 2:18:13 PM
 * 
 * @Copyright This code is intellectual property of 
 * CookSystems International. 2013
 */
@Service
public class FilmBoImpl implements FilmBo {
	
	@Autowired
	FilmDao filmDao;
	
	

	/* (non-Javadoc)
	 * @see com.cooksys.prep.bo.FilmBo#searchByTitle(java.lang.String)
	 */
	public List<ResultBean> searchByTitle(String title) {
		return filmDao.searchByTitle(title);
	}

	/* (non-Javadoc)
	 * @see com.cooksys.prep.bo.FilmBo#getCheckoutCount(java.lang.Short)
	 */
	public long getCheckoutCount(Short filmId) {
		return filmDao.getCheckoutCount(filmId);
	}

	/* (non-Javadoc)
	 * @see com.cooksys.prep.bo.FilmBo#getAvailableCount(java.lang.Short)
	 */
	public long getAvailableCount(Short filmId) {
		return filmDao.getAvailableCount(filmId);
	}

}
