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
	public void saveOrders(Orders order) {
		ordersDao.saveOrders(order);;
	}

	@Override
	public Orders queryOrdersById(Integer toid) {
		return (Orders) ordersDao.findOrdersById(toid);
	}

	@Override
	public void updateOrders(Orders order) {
		ordersDao.updateOrdersById(order);
	}
}
