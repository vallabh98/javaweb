package elearningPortal.Model;

public class User {
	private int User_id;
	private String Name;
	private long Phone_no;
	private String Email;
	private String Address;
	private String Reg_date;
	private String Password;
	private String Upload_Photo;
	
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
	public long getPhone_no() {
		return Phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.Phone_no = phone_no;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	public String getReg_date() {
		return Reg_date;
	}
	public void setReg_date(String reg_date) {
		this.Reg_date = reg_date;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	public String getUpload_Photo() {
		return Upload_Photo;
	}
	public void setUpload_Photo(String upload_Photo) {
		this.Upload_Photo = upload_Photo;
	}

}