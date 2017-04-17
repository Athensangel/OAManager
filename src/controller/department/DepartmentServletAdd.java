package controller.department;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model. Department;
import service.DepartmentService;
import service.impl.DepartmentServiceImpl;

/**
 * Servlet implementation class DepartmentServletAdd
 */
/**
 * 产品添加
 * @author Administrator
 *
 */
@WebServlet("/departmentServletAdd")
public class DepartmentServletAdd extends HttpServlet {
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
    public DepartmentServletAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("views/department/departmentAdd.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  departmentname = request.getParameter("departmentname");
		String managerid = request.getParameter("managerid");
		 Department  department = new  Department();
		 department.setDepartmentname(departmentname);;
		 department.setManagerid(Integer.parseInt(managerid));;
		 departmentService.saveDepartment(department);//新增
		response.sendRedirect("departmentServlet");//新增成功后跳转到员工列表页
	}

}
