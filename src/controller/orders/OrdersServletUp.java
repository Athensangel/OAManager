package controller.orders;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Orders;
import service.OrdersService;
import service.impl.OrdersServiceImpl;

/**
 * Servlet implementation class OrdersServletUp
 */

/**
 * 订单修改
 * @author Administrator
 *
 */
@WebServlet("/ordersServletUp")
public class OrdersServletUp extends HttpServlet {
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
    public OrdersServletUp() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String toid = request.getParameter("toid");
		Orders orders = ordersService.queryOrdersById(Integer.parseInt(toid));
		request.setAttribute("orders", orders);
		request.getRequestDispatcher("/views/orders/ordersUpdate.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String toid = request.getParameter("toid");
		String custName = request.getParameter("custName");
		String custAddress = request.getParameter("custAddress");
		String custPhone = request.getParameter("custPhone");
		String custEmail = request.getParameter("custEmail");
		String oderTime = request.getParameter("oderTime");
		String productId = request.getParameter("productId");
		String productCount = request.getParameter("productCount");
		String money = request.getParameter("money");
		String createTime = request.getParameter("createTime");
		String userId = request.getParameter("userId");
		Orders orders = new Orders();
		orders.setToid(Integer.parseInt(toid));
		orders.setCustName(custName);
		orders.setCustAddress(custAddress);
		orders.setCustPhone(custPhone);
		orders.setCustEmail(custEmail);
		orders.setOderTime(oderTime);
		orders.setProductId(Integer.parseInt(productId));
		orders.setProductCount(Integer.parseInt(productCount));;
		orders.setMoney(Float.parseFloat(money));
		orders.setCreateTime(createTime);
		orders.setUserId(Integer.parseInt(userId));
		ordersService.updateOrders(orders);//订单新增
		response.sendRedirect("ordersServlet");//新增成功后跳转到订单列表页
	}

}
