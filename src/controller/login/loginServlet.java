package controller.login;

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
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
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
	public loginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String sUserName = request.getParameter("username");
		String sPasswd = request.getParameter("password");
		String currentValidateCode = request.getParameter("validateCode");
		String sessionValidateCode = (String) request.getSession().getAttribute("validateCode");
		System.out.println("username:" + sUserName + "\r\n" + "password:" + sPasswd);
		if("".equals(currentValidateCode)){
			System.out.println("验证码为空");
			response.sendRedirect("login.jsp");
		}else if(!currentValidateCode.equals(sessionValidateCode)){
			System.out.println("验证码输入有误");
			response.sendRedirect("login.jsp");
		}else{
		User user = userService.checkUserLogin(sUserName, sPasswd);
		if (sUserName.equals(user.getUsername()) && sPasswd.equals(user.getPassword())) {
			response.sendRedirect("index.jsp");
			request.getSession().setAttribute("UserName", sUserName);
			request.getSession().setAttribute("password", sPasswd);
			request.getSession().setAttribute("toid", user.getToid());
		} else {
			response.sendRedirect("login.jsp");
		}
		}

	}

}
