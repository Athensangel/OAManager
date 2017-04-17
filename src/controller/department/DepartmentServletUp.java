package controller.department;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Department;
import service.DepartmentService;
import service.impl.DepartmentServiceImpl;

/**
 * Servlet implementation class DepartmentServletUp
 */
/**
 * 部门修改
 * @author Administrator
 *
 */
@WebServlet("/departmentServletUp")
public class DepartmentServletUp extends HttpServlet {
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
    public DepartmentServletUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String toid = request.getParameter("toid");
		Department dpartment = departmentService.queryDepartmentById(Integer.parseInt(toid));
		request.setAttribute("department",dpartment);
		request.getRequestDispatcher("/views/department/departmentUpdate.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String toid = request.getParameter("toid");
		String departmentname= request.getParameter("departmentname");
		String managerid = request.getParameter("managerid");
		Department department = new Department();
		department.setToid(Integer.parseInt(toid));
		department.setDepartmentname(departmentname);
		department.setManagerid(Integer.parseInt(managerid));
		departmentService.updateDepartment(department); //修改
		response.sendRedirect("departmentServlet"); //修改成功后跳转到列表页
	}

}
