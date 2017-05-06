package controller.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import model.User;
import service.UserService;
import service.impl.UserServiceImpl;

/**
 * Servlet implementation class UserServletUp
 */
/**
 * 员工修改Servlet
 * @author Administrator
 *
 */
@WebServlet("/userServletUp")
public class UserServletUp extends HttpServlet {
	private static Logger logger = Logger.getLogger(UserServletUp.class);  
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
    public UserServletUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String toid = request.getParameter("toid");
		userService.updateCount(Integer.parseInt(toid));//更新浏览量
		logger.info("+++++++++++++++++更新浏览量+++++++++++++++");
		User user = userService.queryUserById(Integer.parseInt(toid));
		request.setAttribute("user", user);
		request.getRequestDispatcher("/views/user/userUpdate.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String toid = request.getParameter("toid");
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
		user.setToid(Integer.parseInt(toid));
		user.setPassword(password);
		user.setUsername(username);
		user.setRealname(realname);
		user.setSex(sex);
		user.setBirthday(birthday);
		user.setEmail(email);
		user.setAddress(address);
		user.setQq(qq);
		user.setTelphone(telphone);
		user.setSalary(Float.parseFloat(salary));
		user.setDepartid(Integer.parseInt(departId));
		user.setRole(role);
		userService.updateUser(user); //员工修改
		response.sendRedirect("userServlet"); //修改成功后跳转到员工列表页
	}

}
