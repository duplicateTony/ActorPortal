package bean.subs;

public class ActorPreface {
	private String actorRealName;
	private String actorGender;
	private String actorYear;
	private String actorSchool;
	private String actorWorkexp;
	private String actorState;
	private String actorCity;
	private String actorCharacter;
	private String mainPicture;
	
	@Override
	public String toString() {
		return "ActorPreface [actorName=" + actorRealName + ", actorGender=" + actorGender + ", actorYear=" + actorYear
				+ ", actorSchool=" + actorSchool + ", actorWorkexp=" + actorWorkexp + ", actorState=" + actorState
				+ ", actorCity=" + actorCity + ", actorCharacter=" + actorCharacter + ", mainPicture=" + mainPicture
				+ "]";
	}
	
	public String actorRealName() {
		return actorRealName;
	}
	public void setActorName(String actorRealName) {
		this.actorRealName = actorRealName;
	}
	public String getActorGender() {
		return actorGender;
	}
	public void setActorGender(String actorGender) {
		this.actorGender = actorGender;
	}
	public String getActorYear() {
		return actorYear;
	}
	public void setActorYear(String actorYear) {
		this.actorYear = actorYear;
	}
	public String getActorSchool() {
		return actorSchool;
	}
	public void setActorSchool(String actorSchool) {
		this.actorSchool = actorSchool;
	}
	public String getActorWorkexp() {
		return actorWorkexp;
	}
	public void setActorWorkexp(String actorWorkexp) {
		this.actorWorkexp = actorWorkexp;
	}
	public String getActorState() {
		return actorState;
	}
	public void setActorState(String actorState) {
		this.actorState = actorState;
	}
	public String getActorCity() {
		return actorCity;
	}
	public void setActorCity(String actorCity) {
		this.actorCity = actorCity;
	}
	public String getActorCharacter() {
		return actorCharacter;
	}
	public void setActorCharacter(String actorCharacter) {
		this.actorCharacter = actorCharacter;
	}
	
	public String getMainPicture() {
		return mainPicture;
	}

	public void setMainPicture(String mainPicture) {
		this.mainPicture = mainPicture;
	}
}