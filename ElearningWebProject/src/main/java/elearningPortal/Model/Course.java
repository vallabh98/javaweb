package elearningPortal.Model;

public class Course {
	private int Course_id;
	private String Name;
	private String Desp;
	private String Resource;
	private String Fees;
	public int getCourse_id() {
		return Course_id;
	}
	public void setCourse_id(int course_id) {
		this.Course_id = course_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getDesp() {
		return Desp;
	}
	public void setDesp(String desp) {
		this.Desp = desp;
	}
	public String getResource() {
		return Resource;
	}
	public void setResource(String resource) {
		this.Resource = resource;
	}
	public String getFees() {
		return Fees;
	}
	public void setFees(String fees) {
		this.Fees = fees;
	}
}
	
