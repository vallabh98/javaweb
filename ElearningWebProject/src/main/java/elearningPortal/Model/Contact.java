package elearningPortal.Model;

public class Contact {
	private int user_id;
	private String Name;
	private String Email;
	private long Phone;
	private String Message;
	private int contact_id;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
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
	public long getPhone() {
		return Phone;
	}
	public void setPhone(long phone) {
		this.Phone = phone;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		this.Message = message;
	}
	public int getContact_id() {
		return contact_id;
	}
	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}

}