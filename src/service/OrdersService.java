package service;

import java.util.List;

import model.Orders;


public interface OrdersService {
	public List<Orders> queryAllOrders();//查询所有订单信息
	public void deleteOrdersById(Integer toid);//通过toId，即主键，删除订单
	public void saveOrder(Orders order);//新增订单
	public Orders queryOrderById(Integer toid);//通过toId查找订单
	public void updateOrder(Orders order);//修改订单
}
