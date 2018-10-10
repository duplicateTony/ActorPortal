package bean.subs;

import java.util.ArrayList;

public class EmployerInfo {
	private ArrayList<String> filmList;
	private ArrayList<String> tvList;
	private ArrayList<String> actorList;
	
	public ArrayList<String> getFilmList() {
		return filmList;
	}
	public void setFilmList(ArrayList<String> filmList) {
		this.filmList = filmList;
	}
	public ArrayList<String> getTvList() {
		return tvList;
	}
	public void setTvList(ArrayList<String> tvList) {
		this.tvList = tvList;
	}
	public ArrayList<String> getActorList() {
		return actorList;
	}
	public void setActorList(ArrayList<String> actorList) {
		this.actorList = actorList;
	}
	
	@Override
	public String toString() {
		return "EmployerInfo [filmList=" + filmList + ", tvList=" + tvList + ", actorList=" + actorList + "]";
	}
 }