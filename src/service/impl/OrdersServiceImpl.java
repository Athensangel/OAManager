package service.impl;

import java.util.List;

import dao.OrdersDao;
import dao.impl.OrdersDaoImpl;
import model.Orders;
import service.OrdersService;

public class OrdersServiceImpl implements OrdersService {
	private OrdersDao ordersDao = new OrdersDaoImpl();

	public OrdersDao getOrdersDao() {
		return ordersDao;
	}

	public void setOrdersDao(OrdersDao ordersDao) {
		this.ordersDao = ordersDao;
	}

	@Override
	public List<Orders> queryAllOrders() {
		return ordersDao.findAllOrders();
	}

	@Override
	public void deleteOrdersById(Integer toid) {
		ordersDao.delOrdersById(toid);
	}

	@Override
	public void saveOrder(Orders order) {
		ordersDao.saveOrder(order);;
	}

	@Override
	public Orders queryOrderById(Integer toid) {
		return (Orders) ordersDao.findOrdersById(toid);
	}

	@Override
	public void updateOrder(Orders order) {
		ordersDao.updateOrdersById(order);
	}
}
