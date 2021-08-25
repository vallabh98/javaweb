package elearningPortal.Model;

public class Admin {
	private int Admin_id;
	private String Name;
	private String Email;
	private String Password;
	public int getAdmin_id() {
		return Admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.Admin_id = admin_id;
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
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}

}