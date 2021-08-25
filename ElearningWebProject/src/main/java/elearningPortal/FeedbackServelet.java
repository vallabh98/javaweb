package elearningPortal;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import elearningPortal.Dao.AdminDao;
import elearningPortal.Dao.FeedbackDao;
import elearningPortal.Model.Admin;
import elearningPortal.Model.Feedback;

/**
 * Servlet implementation class FeedbackServelet
 */
@WebServlet("/FeedBackServelet")
public class FeedbackServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private FeedbackDao feedbackDao=new FeedbackDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeedbackServelet() {
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
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		Integer f_id=Integer.parseInt(request.getParameter("f_id"));
		String f_back=request.getParameter("f_back");
		Feedback feedback=new Feedback();
		feedback.setUser_id(user_id);
		feedback.setName(name);
		feedback.setEmail(email);
		feedback.setF_id(f_id);
		feedback.setFeedback(f_back);
		
		feedbackDao.insert(feedback);
	}

}