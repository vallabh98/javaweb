package elearningPortal;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import elearningPortal.Dao.AdminDao;
import elearningPortal.Dao.CourseDao;
import elearningPortal.Model.Admin;
import elearningPortal.Model.Course;

/**
 * Servlet implementation class CourseServelet
 */
@WebServlet("/CourseRegister")
public class CourseServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CourseDao courseDao=new CourseDao(); 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CourseServelet() {
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
		Integer Course_id;
		Course_id=Integer.parseInt(request.getParameter("Course_id"));
		String Name=request.getParameter("Name");
		String Desp=request.getParameter("Desp");
		String Resource=request.getParameter("Resource");
		String Fees=request.getParameter("Fees");
		Course course=new Course();
		course.setCourse_id(Course_id);
		course.setName(Name);
		course.setDesp(Desp);;
		course.setResource(Resource);
		course.setFees(Fees);
		
		courseDao.insert(course);
	}

}