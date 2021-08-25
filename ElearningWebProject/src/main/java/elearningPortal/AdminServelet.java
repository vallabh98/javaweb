package elearningPortal;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import elearningPortal.Dao.AdminDao;
import elearningPortal.Model.Admin;

/**
 * Servlet implementation class AdminServelet
 */
@WebServlet("/Insert")
public class AdminServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    private AdminDao adminDao=new AdminDao();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher=request.getRequestDispatcher("Hello.html");
		dispatcher.forward(request, response);*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer admin_id;
		admin_id=Integer.parseInt(request.getParameter("admin_id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		Admin admin=new Admin();
		admin.setAdmin_id(admin_id);
		admin.setName(name);
		admin.setEmail(email);
		admin.setPassword(password);
		
		adminDao.insert(admin);
		RequestDispatcher dispatcher=request.getRequestDispatcher("RegistrationForm.jsp");
		dispatcher.forward(request, response);
		
		
	}

}