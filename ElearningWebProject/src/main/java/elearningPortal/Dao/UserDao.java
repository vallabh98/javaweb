package elearningPortal.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import elearningPortal.Model.User;

public class UserDao {
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
	
	
	public String insert(User user)
	{
		loadDriver(dbDriver);
		Connection con = getConnection();
		String result = "Data entered successfully";
		String sql = "insert into user1"+"(user_id,name,phone_no,email,address,reg_date,password,upload_photolong) Values " + " (?, ?, ?, ?, ?, ?, ?, ?) ";
		
		PreparedStatement ps;
		try {
		ps = con.prepareStatement(sql);
		ps.setInt(1, user.getUser_id());
		ps.setString(2, user.getName());
		ps.setLong(3, user.getPhone_no());
		ps.setString(4, user.getEmail());
		ps.setString(5, user.getAddress());
		ps.setString(6, user.getReg_date());
		ps.setString(7, user.getPassword());
		ps.setString(8, user.getUpload_Photo());
		ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data not entered";
		}
		return result;
	}

}