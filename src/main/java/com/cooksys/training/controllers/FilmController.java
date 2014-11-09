package com.cooksys.training.controllers;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cooksys.training.beans.CustomerBean;
import com.cooksys.training.beans.FilmSearch;
import com.cooksys.training.beans.RentalBean;
import com.cooksys.training.beans.ResultBean;
import com.cooksys.training.bo.CustomerBo;
import com.cooksys.training.cart.CartItem;
import com.cooksys.training.dao.FilmDao;

@SessionAttributes({"cart","categoryList", "filmSearch",  "principal", "username", "customerList", "rentalHistory" })
@Controller
public class FilmController {

	private static final Logger logger = LoggerFactory
			.getLogger(FilmController.class);

	@ModelAttribute("filmSearch")
	public FilmSearch newFilmSearch() {
		return new FilmSearch();
	}

	// @Autowired
	// FilmBo filmBo;
	@Autowired
	CustomerBo customerBo;
	
	@Autowired
	FilmDao filmDao;

	@ModelAttribute("categoryList")
	public Map<Byte, String> populateMap() {

		return filmDao.getCategory();

	}
	/*@ModelAttribute("userList")
	public List<Customer> getUser(String username){
		
		return filmDao.searchUsername(username);
	}*/
	

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(Locale locale, Model model, @ModelAttribute FilmSearch filmSearch, Principal principal) {
		logger.info("Welcome home! The client locale is {}.", locale);
		filmSearch.setSearched(false);
		String username = principal.getName();
		populateMap();
		model.addAttribute("username", username);
		System.out.println();

		return "search";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String searchResult(@ModelAttribute FilmSearch filmSearch, @ModelAttribute CartItem ci,  Model model ){
		byte category = filmSearch.getCategory();
		String title = filmSearch.getTitle();
		
		List<ResultBean> filmList = filmDao.searchFilms(category, title);
		filmSearch.setFilmSearchList(filmList);
		filmSearch.setSearched(true);
			logger.info("filmList: " + filmList);
			model.addAttribute("filmList", filmList);
			
			if(!model.containsAttribute("cart")) {
			      model.addAttribute("cart", new ArrayList<ResultBean>());
			}
		
		return "search";
	}
	
	@RequestMapping(value = "/profile", method = RequestMethod.GET )
	public String profile(Model model, Principal principal, @ModelAttribute CustomerBean cBean) {
		logger.info("Welcome home! The client locale is {}.");
		List<CustomerBean> customerList;
		List<RentalBean> rentalHistoryList;
		String username = principal.getName();
		logger.info("please work here: " + username);
		
		customerList = customerBo.findCustomer(username);
		rentalHistoryList = customerBo.getRentalHistory(username);
		model.addAttribute("customerList", customerList);
		model.addAttribute("rentalhistory", rentalHistoryList);
		logger.info("current logged in user " + customerList.toString());
		
		logger.info("resutls from rental history " + rentalHistoryList.toString());
		

		
		
		
		
		
		return "profile";
	}
	
	

}
