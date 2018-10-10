package bean.subs;

import java.util.ArrayList;

public class ActorDetail {
	private String actorHeight;
	private String actorWeight;
	private String shoulderWidth;
	private String shoulderLength;
	private String legLength;
	private String waist;
	private String hipWidth;
	private ArrayList<String> pictures;
	private String resume;
	
	public String getActorHeight() {
		return actorHeight;
	}
	public void setActorHeight(String actorHeight) {
		this.actorHeight = actorHeight;
	}
	public String getActorWeight() {
		return actorWeight;
	}
	public void setActorWeight(String actorWeight) {
		this.actorWeight = actorWeight;
	}
	public String getShoulderWidth() {
		return shoulderWidth;
	}
	public void setShoulderWidth(String shoulderWidth) {
		this.shoulderWidth = shoulderWidth;
	}
	public String getShoulderLength() {
		return shoulderLength;
	}
	public void setShoulderLength(String shoulderLength) {
		this.shoulderLength = shoulderLength;
	}
	public String getLegLength() {
		return legLength;
	}
	public void setLegLength(String legLength) {
		this.legLength = legLength;
	}
	public String getWaist() {
		return waist;
	}
	public void setWaist(String waist) {
		this.waist = waist;
	}
	public String getHipWidth() {
		return hipWidth;
	}
	public void setHipWidth(String hipWidth) {
		this.hipWidth = hipWidth;
	}
	public ArrayList<String> getPictures() {
		return pictures;
	}
	public void setPictures(ArrayList<String> pictures) {
		this.pictures = pictures;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	@Override
	public String toString() {
		return "ActorDetail [actorHeight=" + actorHeight + ", actorWeight=" + actorWeight + ", shoulderWidth="
				+ shoulderWidth + ", shoulderLength=" + shoulderLength + ", legLength=" + legLength + ", waist=" + waist
				+ ", hipWidth=" + hipWidth + ", pictures=" + pictures + ", resume=" + resume + "]";
	}
}