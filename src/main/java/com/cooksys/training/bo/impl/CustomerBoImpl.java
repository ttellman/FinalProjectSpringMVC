package com.cooksys.training.bo.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cooksys.training.beans.CustomerBean;
import com.cooksys.training.beans.RentalBean;
import com.cooksys.training.bo.CustomerBo;


@Transactional()
@Repository
public class CustomerBoImpl implements CustomerBo {

	private static final Logger logger = LoggerFactory.getLogger(CustomerBoImpl.class);
	
	
	@Autowired
	SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	

	public List<CustomerBean> findCustomer(String username) {

		Session session = getCurrentSession();
		List<CustomerBean> userList = null;

		String usernameLikeString = username;
		String hql = "select new com.cooksys.training.beans.CustomerBean( u.customer.firstName, u.customer.lastName, u.customer.email, u.customer.store.storeId, u.username, u.password) from  Users u where u.username like :username";
		Query query = session.createQuery(hql);
		query.setParameter("username", usernameLikeString);
		userList = query.list();
		logger.info("returning the list of customer beans" + userList.toString());
		return userList;
	}
	public List<RentalBean> getRentalHistory(String username) {
		
		Session session = getCurrentSession();
		List<RentalBean> rentalList = null;
		String usernameLikeString = username;
		String hq1 = "select new com.cooksys.training.beans.RentalBean(r.rentalId, r.inventory.film.filmId, r.inventory.film.title, r.inventory.store.storeId, r.inventory.inventoryId, r.customer.customerId, r.customer.users.username, r.rentalDate, r.returnDate) from Rental r where r.customer.users.username like :username";
		Query query = session.createQuery(hq1);
		query.setParameter("username", usernameLikeString);
		rentalList = query.list();
		
		logger.info(rentalList.toString());
		
		return rentalList;
	}

	

}
