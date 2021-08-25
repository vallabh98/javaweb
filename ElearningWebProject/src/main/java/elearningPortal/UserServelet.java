package elearningPortal;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import elearningPortal.Dao.AdminDao;
import elearningPortal.Dao.UserDao;
import elearningPortal.Model.Admin;
import elearningPortal.Model.User;

/**
 * Servlet implementation class UserServelet
 */
@WebServlet("/UserRegistration")
public class UserServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao=new UserDao();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer user_id;
		user_id=Integer.parseInt(request.getParameter("user_id"));
		String name=request.getParameter("username");
		Integer phone=Integer.parseInt(request.getParameter("phone"));
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String reg = new SimpleDateFormat("yyyy-MM-dd").format(new Date(request.getParameter("reg")));
		//String reg=request.getParameter("reg");
		String password=request.getParameter("password");
		String photo=request.getParameter("photo");
		User user=new User();
		user.setUser_id(user_id);
		user.setName(name);
		user.setPhone_no(phone);
		user.setEmail(email);
		user.setAddress(address);
		user.setReg_date(reg);
		user.setPassword(password);
		user.setUpload_Photo(photo);
		
		userDao.insert(user);
	}

}