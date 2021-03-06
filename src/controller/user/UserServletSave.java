package controller.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import service.UserService;
import service.impl.UserServiceImpl;

/**
 * Servlet implementation class UserServletSave
 */
/**
 * 员工新增servlet
 * @author Administrator
 *
 */
@WebServlet("/userServletSave")
public class UserServletSave extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserService userService = new UserServiceImpl();

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserServletSave() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("views/user/userSave.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String realname = request.getParameter("realname");
		String sex = request.getParameter("sex");
		String birthday = request.getParameter("birthday");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String telphone = request.getParameter("telphone");
		String qq = request.getParameter("qq");
		String salary = request.getParameter("salary");
		String departId = request.getParameter("departid");
		String role = request.getParameter("role");
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setRealname(realname);
		user.setSex(sex);
		user.setBirthday(birthday);
		user.setEmail(email);
		user.setAddress(address);
		user.setTelphone(telphone);
		user.setQq(qq);
		user.setSalary(Float.parseFloat(salary));
		user.setDepartid(Integer.parseInt(departId));
		user.setRole(role);
		userService.saveUser(user); //员工新增
		//request.getRequestDispatcher("/userServlet").forward(request, response);
		response.sendRedirect("userServlet");//新增成功后跳转到员工列表页
	}

}
