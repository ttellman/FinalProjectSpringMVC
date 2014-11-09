package com.cooksys.training.controllers;

import java.math.BigDecimal;
import java.security.Principal;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.cooksys.training.beans.FilmSearch;
import com.cooksys.training.beans.ResultBean;
import com.cooksys.training.cart.CartItem;
import com.cooksys.training.cart.MyService;
import com.cooksys.training.cart.ShoppingCart;


@SessionAttributes({ "cart","categoryList", "filmSearch", "cart", "principal"  })
@Controller
public class CartController {
	
	
//	@ModelAttribute("cart")
//	private List<ResultBean> populateCart(){
//		List<ResultBean> cart = new ArrayList();
//		
//		
//		return cart;
//	}
	@Autowired
	CartItem ci;
	
	private static final Logger logger = LoggerFactory
			.getLogger(CartController.class);

	

	

	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public String cart(Locale locale, Model model, Principal principal,
			@ModelAttribute ResultBean resultBean) {
		logger.info("Welcome home! The client locale is {}.", locale);

		

		return "cart";
	}
	
	/*
	 * Method to add items to cart from search page
	 * Creates a CartItem adding that to list for cart.
	 */
	@RequestMapping(value = "add", method = RequestMethod.POST)
	  public String addProduct( @RequestParam(value = "title") String item, @RequestParam(value = "description")String description, Short filmId, @RequestParam(value = "rentalrate") BigDecimal rentalrate,
	      @ModelAttribute("cart") List<CartItem> cart, @ModelAttribute CartItem ci, @ModelAttribute FilmSearch filmSearch) {
		item = ci.getTitle();
		filmId = ci.getFilmId();
		rentalrate = ci.getRentalrate();
		description = ci.getDescription();
		ci = new CartItem(item, rentalrate, description, filmId);
		logger.info("this should be resultbean adding to cart " + item);
		//adding CartItem Object to cart
	    cart.add(ci);
	    System.out.println(cart.toString());
	    
	    String str = "Added to cart " + item + " " + rentalrate;
	    logger.warn(str);
	    
	    return "redirect:/search";
		
	  
	}

}
