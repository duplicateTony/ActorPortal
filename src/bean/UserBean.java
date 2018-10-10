package bean;

public class UserBean {
	private int userId;
	private String userType;
	private String userName;
	private String userPass;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	
	@Override
	public String toString() {
		return "UserBean [userId=" + userId + ", userType=" + userType + ", userName=" + userName + ", userPass="
				+ userPass + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}