package controller.department;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.DepartmentService;
import service.impl.DepartmentServiceImpl;

/**
 * Servlet implementation class DepartmentServletDel
 */
@WebServlet("/departmentServletDel")
public class DepartmentServletDel extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private DepartmentService departmentService=new DepartmentServiceImpl();
	
    public DepartmentService getDepartmentService() {
		return departmentService;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentServletDel() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strToid = request.getParameter("toid");
		int toid = Integer.parseInt(strToid);// String 转 int
		departmentService.deleteDepartmentById(toid);
		request.getRequestDispatcher("/departmentServlet").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
