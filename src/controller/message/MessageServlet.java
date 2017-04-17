package controller.message;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Message;
import service.MessageService;
import service.impl.MessageServiceImpl;

/**
 * Servlet implementation class messageServlet
 */
/**
 * 信息列表Severlet
 * @author Administrator
 *
 */
@WebServlet("/messageServlet")
public class MessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private MessageService messageService=new MessageServiceImpl();
	
    public MessageService getMessageService() {
		return messageService;
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public MessageServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Message> messageList = messageService.queryAllMessage();
		request.setAttribute("messageList", messageList);
		//两种跳转的区别
		//response.sendRedirect("userList.jsp"); //这种方式跳转，数据不能带到要跳转的页面
		request.getRequestDispatcher("/views/message/messageList.jsp").forward(request,response);//这种跳转时数据会传到跳转页面
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
