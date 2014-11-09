package com.cooksys.training.controllers;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cooksys.training.beans.ResultBean;
import com.cooksys.training.bo.BrowseResults;
import com.cooksys.training.bo.FilmBo;
import com.cooksys.training.dao.FilmDao;
import com.cooksys.training.model.Customer;

/**
 * Handles requests for the application home page.
 */
@SessionAttributes({"cart", "principal"  })
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	Customer userResult;
	BrowseResults browseResult;
	
	@Autowired
	FilmBo filmBo;
	
	@Autowired
	FilmDao filmDao;
	


	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model, Principal principal, @ModelAttribute ResultBean resultBean ) {
		logger.info("Welcome home! The client locale is {}.", locale);
		List<ResultBean> filmList = filmBo.searchByTitle("Academy");
		logger.info("filmList: " + filmList);
		String name = principal.getName();
		logger.info("this is in home method username: " + name);
		
		if(!model.containsAttribute("cart")) {
		      model.addAttribute("cart", new ArrayList<ResultBean>());
		    }
		
		

		return "home";
	}
	
	

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		return "test";
	}

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		return "main";
	}

	

	@RequestMapping(value = "/browse", method = RequestMethod.GET)
	public String browse(Locale locale, Model model,  @ModelAttribute BrowseResults browseResult) {
		logger.info("Welcome home! The client locale is {}.", locale);
		//List<String> categoryList = filmDao.findCategory();
		List<ResultBean> actionList;
		List<ResultBean> animationList;
		List<ResultBean> childrenList;
		List<ResultBean> classicsList;
		List<ResultBean> comedyList;
		List<ResultBean> documentaryList;
		List<ResultBean> dramaList;
		List<ResultBean> foreignList;
		List<ResultBean> familyList;
		List<ResultBean> gamesList;
		List<ResultBean> horrorList;
		List<ResultBean> musicList;
		List<ResultBean> newList;
		List<ResultBean> scifiList;
		List<ResultBean> sportsList;
		List<ResultBean> travelList;
		
		  	/*
		  	 * Add all list for the browse view to model when controller is invoked
		  	 */
			browseResult.setActionList(filmDao.searchByCategory("Action"));
			actionList = browseResult.getActionList();
			model.addAttribute("actionList", actionList);
			browseResult.setAnimationList(filmDao.searchByCategory("Animation"));
			animationList = browseResult.getAnimationList();
			model.addAttribute("animationList", animationList);
		 	browseResult.setChildrenList(filmDao.searchByCategory("Children"));
		 	childrenList = browseResult.getActionList();
		 	model.addAttribute("childrenList", childrenList);
		 	browseResult.setClassicsList(filmDao.searchByCategory("Classics"));
		 	classicsList = browseResult.getClassicsList();
		 	model.addAttribute("classicsList", classicsList);
		 	browseResult.setComedyList(filmDao.searchByCategory("Comedy"));
		 	comedyList = browseResult.getComedyList();
		 	model.addAttribute("comedyList", comedyList);
		 	browseResult.setDocumentaryList(filmDao.searchByCategory("Documentary"));
		 	documentaryList = browseResult.getDocumentaryList();
		 	model.addAttribute("documentaryList", documentaryList);
		 	browseResult.setDramaList(filmDao.searchByCategory("Drama"));
		 	dramaList = browseResult.getDramaList();
		 	model.addAttribute("dramaList", dramaList);
		 	browseResult.setFamilyList(filmDao.searchByCategory("Family"));
		 	familyList = browseResult.getFamilyList();		 	
		 	model.addAttribute("familyList", familyList);
		 	browseResult.setForeignList(filmDao.searchByCategory("Foreign"));
		 	foreignList = browseResult.getForeignList();
		 	model.addAttribute("foreignList", foreignList);
		 	browseResult.setGamesList(filmDao.searchByCategory("Games"));
		 	gamesList = browseResult.getGamesList();
		 	logger.info("from browse function checking " +gamesList.toString()); 
		 	model.addAttribute("gamesList", gamesList);
		 	browseResult.setHorrorList(filmDao.searchByCategory("Horror"));
		 	horrorList = browseResult.getHorrorList();
		 	model.addAttribute("horrorList", horrorList);
		 	browseResult.setMusicList(filmDao.searchByCategory("Music"));
		 	musicList = browseResult.getMusicList();
		 	model.addAttribute("musicList", musicList);
		 	browseResult.setNewList(filmDao.searchByCategory("New"));
		 	newList = browseResult.getNewList();
		 	model.addAttribute("newList", newList);
		 	browseResult.setScifiList(filmDao.searchByCategory("Sci-Fi"));
		 	scifiList = browseResult.getScifiList();
		 	model.addAttribute("scifiList", scifiList);
		 	browseResult.setSportsList(filmDao.searchByCategory("Sports"));
		 	sportsList = browseResult.getSportsList();
		 	model.addAttribute("sportsList", sportsList);
		 	browseResult.setTravelList(filmDao.searchByCategory("Travel"));
		 	travelList = browseResult.getTravelList();
		 	model.addAttribute("travelList", travelList);
		 	
			

		return "browse";
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		return "login";
	}
}
