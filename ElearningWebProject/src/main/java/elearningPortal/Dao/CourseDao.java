package elearningPortal.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import elearningPortal.Model.Course;

public class CourseDao {
	private String dbUrl = "jdbc:mysql://localhost:3306/elearningPortal";
	private String dbUname = "root";
	private String dbPassword = "root";
	private String dbDriver = "com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	
	public String insert(Course course)
	{
		loadDriver(dbDriver);
		Connection con = getConnection();
		String result = "Data entered successfully";
		String sql = "insert into course"+"(course_id,c_name,c_desp,c_fees,c_resource) Values " + " (?, ?, ?, ?, ?) ";
		
		PreparedStatement ps;
		try {
		ps = con.prepareStatement(sql);
		ps.setInt(1, course.getCourse_id());
		ps.setString(2, course.getName());
		ps.setString(3, course.getDesp());
		ps.setString(5, course.getResource());
		ps.setString(4, course.getFees());
		ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data not entered";
		}
		return result;
	}
}