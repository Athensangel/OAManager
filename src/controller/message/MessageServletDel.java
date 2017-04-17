package controller.message;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MessageService;
import service.impl.MessageServiceImpl;

/**
 * Servlet implementation class MessageServletDel
 */
@WebServlet("/messageServletDel")
public class MessageServletDel extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private MessageService  messageService = new MessageServiceImpl();
	
    public MessageService getMessageService() {
		return messageService;
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public MessageServletDel() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strToid = request.getParameter("toid");
		int toid = Integer.parseInt(strToid);// String 转 int
		messageService.deleteMessageById(toid);
		request.getRequestDispatcher("/messageServlet").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
