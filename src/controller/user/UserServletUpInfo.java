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
 * Servlet implementation class UserServletUpInfo
 */
@WebServlet("/userServletUpInfo")
public class UserServletUpInfo extends HttpServlet {
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
    public UserServletUpInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String toid = request.getParameter("toid");
		User user = userService.queryUserById(Integer.parseInt(toid));
		request.setAttribute("user", user);
		request.getRequestDispatcher("/views/user/userUpdateInfo.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String toid = request.getParameter("toid");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User();
		user.setToid(Integer.parseInt(toid));
		user.setPassword(password);
		user.setUsername(username);
		userService.updateUserInfo(user); //员工修改
		response.sendRedirect("userServlet"); //修改成功后跳转到员工列表页
	}

}
