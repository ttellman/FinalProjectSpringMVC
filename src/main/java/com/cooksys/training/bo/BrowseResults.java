package com.cooksys.training.bo;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cooksys.training.beans.ResultBean;
@Component
@SessionAttributes({"actionList", "animationList", "comedyList", "childrenList", "classicsList", "documentaryList", "familyList", "foreignList", "gamesList", "horrorList", "musicList", "newList", "scifiList", "sportsList","travelList" })
public class BrowseResults {
	
	private List<ResultBean> actionList;
	private List<ResultBean> animationList;
	private List<ResultBean> comedyList;
	private List<ResultBean> childrenList;
	private List<ResultBean> classicsList;
	private List<ResultBean> documentaryList;
	private List<ResultBean> dramaList;
	private List<ResultBean> familyList;
	private List<ResultBean> foreignList;
	private List<ResultBean> gamesList;
	private List<ResultBean> horrorList;
	private List<ResultBean> musicList;
	private List<ResultBean> newList;
	private List<ResultBean> scifiList;
	private List<ResultBean> sportsList;
	private List<ResultBean> travelList;
	
	
	public List<ResultBean> getActionList() {
		return actionList;
	}
	public void setActionList(List<ResultBean> actionList) {
		this.actionList = actionList;
	}
	public List<ResultBean> getAnimationList() {
		return animationList;
	}
	public void setAnimationList(List<ResultBean> animationList) {
		this.animationList = animationList;
	}
	public List<ResultBean> getComedyList() {
		return comedyList;
	}
	public void setComedyList(List<ResultBean> comedyList) {
		this.comedyList = comedyList;
	}
	public List<ResultBean> getChildrenList() {
		return childrenList;
	}
	public void setChildrenList(List<ResultBean> childrenList) {
		this.childrenList = childrenList;
	}
	public List<ResultBean> getClassicsList() {
		return classicsList;
	}
	public void setClassicsList(List<ResultBean> classicsList) {
		this.classicsList = classicsList;
	}
	public List<ResultBean> getDocumentaryList() {
		return documentaryList;
	}
	public void setDocumentaryList(List<ResultBean> documentaryList) {
		this.documentaryList = documentaryList;
	}
	public List<ResultBean> getDramaList() {
		return dramaList;
	}
	public void setDramaList(List<ResultBean> dramaList) {
		this.dramaList = dramaList;
	}
	public List<ResultBean> getFamilyList() {
		return familyList;
	}
	public void setFamilyList(List<ResultBean> familyList) {
		this.familyList = familyList;
	}
	public List<ResultBean> getForeignList() {
		return foreignList;
	}
	public void setForeignList(List<ResultBean> foreignList) {
		this.foreignList = foreignList;
	}
	public List<ResultBean> getGamesList() {
		return gamesList;
	}
	public void setGamesList(List<ResultBean> gamesList) {
		this.gamesList = gamesList;
	}
	public List<ResultBean> getHorrorList() {
		return horrorList;
	}
	public void setHorrorList(List<ResultBean> horrorList) {
		this.horrorList = horrorList;
	}
	public List<ResultBean> getMusicList() {
		return musicList;
	}
	public void setMusicList(List<ResultBean> musicList) {
		this.musicList = musicList;
	}
	public List<ResultBean> getNewList() {
		return newList;
	}
	public void setNewList(List<ResultBean> newList) {
		this.newList = newList;
	}
	public List<ResultBean> getScifiList() {
		return scifiList;
	}
	public void setScifiList(List<ResultBean> scifiList) {
		this.scifiList = scifiList;
	}
	public List<ResultBean> getSportsList() {
		return sportsList;
	}
	public void setSportsList(List<ResultBean> sportsList) {
		this.sportsList = sportsList;
	}
	public List<ResultBean> getTravelList() {
		return travelList;
	}
	public void setTravelList(List<ResultBean> travelList) {
		this.travelList = travelList;
	}
	

}
