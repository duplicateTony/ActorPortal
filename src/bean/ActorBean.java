package bean;

import bean.subs.ActorDetail;
import bean.subs.ActorPreface;

public class ActorBean {
	private int actorId;
	private int actorName;
	private ActorPreface actorPreface;
	private ActorDetail actorDetail;
	
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	public int getActorName() {
		return actorName;
	}
	public void setActorName(int actorName) {
		this.actorName = actorName;
	}
	public ActorPreface getActorPreface() {
		return actorPreface;
	}
	public void setActorPreface(ActorPreface actorPreface) {
		this.actorPreface = actorPreface;
	}
	public ActorDetail getActorDetail() {
		return actorDetail;
	}
	public void setActorDetail(ActorDetail actorDetail) {
		this.actorDetail = actorDetail;
	}
	
	@Override
	public String toString() {
		return "ActorBean [actorId=" + actorId + ", actorName=" + actorName + ", actorPreface=" + actorPreface
				+ ", actorDetail=" + actorDetail + "]";
	}
}