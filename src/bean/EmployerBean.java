package bean;

import bean.subs.EmployerInfo;

public class EmployerBean {
	private int employerId;
	private String employerName;
	private String employerState;
	private String employerCity;
	private String employerContactor;
	private String employerMail;
	private String employerPhone;
	private EmployerInfo employerInfo;
	public int getEmployerId() {
		return employerId;
	}
	public void setEmployerId(int employerId) {
		this.employerId = employerId;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public String getEmployerState() {
		return employerState;
	}
	public void setEmployerState(String employerState) {
		this.employerState = employerState;
	}
	public String getEmployerCity() {
		return employerCity;
	}
	public void setEmployerCity(String employerCity) {
		this.employerCity = employerCity;
	}
	public String getEmployerContactor() {
		return employerContactor;
	}
	public void setEmployerContactor(String employerContactor) {
		this.employerContactor = employerContactor;
	}
	public String getEmployerMail() {
		return employerMail;
	}
	public void setEmployerMail(String employerMail) {
		this.employerMail = employerMail;
	}
	public String getEmployerPhone() {
		return employerPhone;
	}
	public void setEmployerPhone(String employerPhone) {
		this.employerPhone = employerPhone;
	}
	public EmployerInfo getEmployerInfo() {
		return employerInfo;
	}
	public void setEmployerInfo(EmployerInfo employerInfo) {
		this.employerInfo = employerInfo;
	}
	
	@Override
	public String toString() {
		return "EmployerBean [employerId=" + employerId + ", employerName=" + employerName + ", employerState="
				+ employerState + ", employerCity=" + employerCity + ", employerContactor=" + employerContactor
				+ ", employerMail=" + employerMail + ", employerPhone=" + employerPhone + ", employerInfo="
				+ employerInfo + "]";
	}
}