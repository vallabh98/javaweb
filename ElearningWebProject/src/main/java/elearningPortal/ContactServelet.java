package elearningPortal;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import elearningPortal.Dao.AdminDao;
import elearningPortal.Dao.ContactDao;
import elearningPortal.Model.Admin;
import elearningPortal.Model.Contact;

/**
 * Servlet implementation class ContactServelet
 */
@WebServlet("/ContactServelet")
public class ContactServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ContactDao contactDao=new ContactDao(); 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactServelet() {
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
		user_id=Integer.parseInt(request.getParameter("u_id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		long phone=Long.parseLong(request.getParameter("phone"));
		String message=request.getParameter("message");
		Integer cu_id=Integer.parseInt(request.getParameter("cu_id"));
		Contact contact=new Contact();
		contact.setUser_id(user_id);
		contact.setName(name);
		contact.setEmail(email);
		contact.setPhone(phone);
		contact.setMessage(message);
		contact.setContact_id(cu_id);
		contactDao.insert(contact);
	}

}