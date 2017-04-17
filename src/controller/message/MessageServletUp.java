package controller.message;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Message;
import service.MessageService;
import service.impl.MessageServiceImpl;

/**
 * Servlet implementation class MessageServletUp
 */

/**
 *信息修改Servlet
 * @author Administrator
 *
 */
@WebServlet("/MessageServletUp")
public class MessageServletUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private MessageService messageService = new MessageServiceImpl();

	public MessageService getMessageService() {
		return messageService;
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MessageServletUp() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		Message message = messageService.queryMessageById(Integer.parseInt(id));
		request.setAttribute("message", message);
		request.getRequestDispatcher("/views/message/messageUpdate.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String from_id = request.getParameter("fromId");
		String to_id = request.getParameter("toId");
		String content = request.getParameter("content");
		String isread = request.getParameter("isRead");
		Message message = new Message();
		message.setId(Integer.parseInt(id));
		message.setFromId(Integer.parseInt(from_id));
		message.setToId(Integer.parseInt(to_id));
		message.setContent(content);
		message.setIsRead(isread);
		messageService.updateMessage(message);//信息修改
		response.sendRedirect("messageServlet"); //修改成功后跳转到信息列表页
	}
}
