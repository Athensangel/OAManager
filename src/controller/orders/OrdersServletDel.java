package controller.orders;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.OrdersService;
import service.impl.OrdersServiceImpl;

/**
 * Servlet implementation class OrdersServletDel
 */
/**
 * 订单删除
 * @author Administrator
 *
 */
@WebServlet("/ordersServletDel")
public class OrdersServletDel extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private OrdersService ordersService = new OrdersServiceImpl();

	public OrdersService getOrdersService() {
		return ordersService;
	}

	public void setOrdersService(OrdersService ordersService) {
		this.ordersService = ordersService;
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OrdersServletDel() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String strToid = request.getParameter("toid");
		int toid = Integer.parseInt(strToid);// String 转 int
		ordersService.deleteOrdersById(toid);
		request.getRequestDispatcher("/ordersServlet").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
