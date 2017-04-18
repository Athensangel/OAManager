package controller.orders;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Orders;
import service.OrdersService;
import service.impl.OrdersServiceImpl;

/**
 * Servlet implementation class OrdersServlet
 */
@WebServlet("/ordersServlet")
public class OrdersServlet extends HttpServlet {
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
    public OrdersServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Orders> ordersList=ordersService.queryAllOrders();
		request.setAttribute("ordersList", ordersList);
		//两种跳转的区别
		//response.sendRedirect("userList.jsp"); //这种方式跳转，数据不能带到要跳转的页面
		request.getRequestDispatcher("/views/orders/ordersList.jsp").forward(request,response);//这种跳转时数据会传到跳转页面
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
