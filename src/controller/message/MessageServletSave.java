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
 * Servlet implementation class MessageServletSave
 */
/**
* 信息新增servlet
* @author Administrator
*
*/

@WebServlet("/messageServletSave")
public class MessageServletSave extends HttpServlet {
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
	public MessageServletSave() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("views/message/messageSave.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String from_id = request.getParameter("from_id");
		String to_id = request.getParameter("to_id");
		String content = request.getParameter("content");
		String isread = request.getParameter("isread");
		Message message = new Message();
		message.setFromId(Integer.parseInt(from_id));;
		message.setToId(Integer.parseInt(to_id));;;
		message.setContent(content);
		message.setIsRead(isread);
		messageService.saveMessage(message);//信息新增
		//request.getRequestDispatcher("/userServlet").forward(request, response);
		response.sendRedirect("messageServlet");//新增成功后跳转到员工列表页
	}

}
