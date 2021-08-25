package elearningPortal.Model;

public class Feedback {
	private int User_id;
	private String Name;
	private String Email;
	private int F_id;
	private String Feedback;
	
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		this.User_id = user_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public int getF_id() {
		return F_id;
	}
	public void setF_id(int f_id) {
		this.F_id = f_id;
	}
	public String getFeedback() {
		return Feedback;
	}
	public void setFeedback(String feedback) {
		this.Feedback = feedback;
	}
	

}