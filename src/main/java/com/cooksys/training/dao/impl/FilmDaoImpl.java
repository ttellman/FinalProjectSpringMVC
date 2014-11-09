/**
 * 
 */
package com.cooksys.training.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cooksys.training.beans.FilmSearch;
import com.cooksys.training.beans.ResultBean;
import com.cooksys.training.dao.FilmDao;
import com.cooksys.training.model.Category;
import com.cooksys.training.model.Customer;

/**
 * @author Cooksys Teacher May 14, 2013 2:22:36 PM
 * 
 * @Copyright This code is intellectual property of CookSystems International.
 *            2013
 */
@Transactional(readOnly = true)
@Repository
public class FilmDaoImpl implements FilmDao {

	private static final Logger logger = LoggerFactory
			.getLogger(FilmDaoImpl.class);

	FilmSearch filmsearch;
	Customer userResult;

	@Autowired
	SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public List<ResultBean> searchByTitle(String title) {

		Session session = getCurrentSession();
		List<ResultBean> filmList = null;

		String titleLikeString = "%" + title + "%";
		String hql = "select new com.cooksys.training.beans.ResultBean(fc.film.filmId, fc.film.title, fc.film.rating, fc.film.rentalRate, fc.film.length, fc.film.description, fc.category.name ) from  Film f join f.filmCategories fc where f.title like :title";
		Query query = session.createQuery(hql);
		query.setParameter("title", titleLikeString);
		filmList = query.list();

		return filmList;
	}
	
	public List<ResultBean> searchByCategory(String category) {

		Session session = getCurrentSession();
		List<ResultBean> filmList = null;

		String titleLikeString = "%" + category + "%";
		String hql = "select new com.cooksys.training.beans.ResultBean(fc.film.filmId, fc.film.title, fc.film.rating, fc.film.rentalRate, fc.film.length, fc.film.description, fc.category.name ) from  Category c join c.filmCategories fc where c.name like :category";
		Query query = session.createQuery(hql);
		query.setParameter("category", titleLikeString);
		filmList = query.list();

		return filmList;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cooksys.prep.dao.FilmDao#getCheckoutCount(java.lang.Short)
	 */
	public long getCheckoutCount(Short filmId) {
		Session session = getCurrentSession();

		long checkoutCount = 0;

		String hql = "select count(*) from  Rental r where r.returnDate is null and r.inventory.film.filmId = :filmId";
		Query query = session.createQuery(hql);
		query.setParameter("filmId", filmId);
		List<Long> countList = query.list();
		checkoutCount = countList.get(0);
		System.out.println("checkoutCount: " + checkoutCount);

		return checkoutCount;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cooksys.prep.dao.FilmDao#getAvailableCount(java.lang.Short)
	 */
	public long getAvailableCount(Short filmId) {

		long availableCount = 0;

		Session session = getCurrentSession();

		String hql = "select count(*) from  Inventory i where i.film.filmId = :filmId and i.inventoryId not in (select r.inventory.inventoryId from  Rental r where r.returnDate is null and r.inventory.film.filmId = :filmId)";
		Query query = session.createQuery(hql);
		query.setParameter("filmId", filmId);
		List<Long> countList = query.list();
		availableCount = countList.get(0);
		System.out.println("availableCount: " + availableCount);

		return availableCount;
	}

	public Map<Byte, String> getCategory() {
		List<Category> categories = null;
		Session session = getCurrentSession();
		String hq1 = "from Category";
		Query query = session.createQuery(hq1);
		categories = query.list();
		logger.info(categories.toString());
		Map<Byte, String> mapofCategories = new HashMap<Byte, String>();

		for (Category category : categories)
			mapofCategories.put(category.getCategoryId(), category.getName());

		return mapofCategories;

	}

	public List<ResultBean> searchFilms(Byte category, String title) {

		logger.info("category: " + category);
		logger.info("title: " + title);

		String titleLikeString = "%" + title + "%";

		List<ResultBean> filmList = null;
		Session session = getCurrentSession();
		StringBuffer h2 = new StringBuffer();
		h2.append("select new com.cooksys.training.beans.ResultBean(fc.film.filmId, fc.film.title, fc.film.rating, fc.film.rentalRate, fc.film.length, fc.film.description, fc.category.name ) from  Film f join f.filmCategories fc where f.title like :title ");
		if (category > 0) {
			h2.append("and fc.category.categoryId = :category ");
		}

		Query query = session.createQuery(h2.toString());
		query.setParameter("title", titleLikeString);

		if (category > 0) {
			query.setParameter("category", category);
		}

		filmList = query.list();

		return filmList;

	}

	
	public List<String> findCategory() {
		List<Category> categoriesList = null;
		Session session = getCurrentSession();
		String hq1 = "from Category";
		Query query = session.createQuery(hq1);
		categoriesList = query.list();
		logger.info(categoriesList.toString());
		List<String>returnCategory = new ArrayList<String>();
		
		for(Category name  : categoriesList )
			returnCategory.add(name.getName());
		
		logger.info(returnCategory.toString());
		
		
		

		return returnCategory;
	}
	
	public List<Customer> searchUsername(String username) {

		Session session = getCurrentSession();
		List<Customer> userList = null;

		String usernameLikeString = username;
		String hql = "select new com.cooksys.training.beans.CustomerBean( u.customer.firstName, u.customer.lastName, u.customer.email, u.customer.store.storeId, u.username, u.password) from  Users u where u.username like :username";
		Query query = session.createQuery(hql);
		query.setParameter("username", usernameLikeString);
		userList = query.list();

		return userList;
	}

}
