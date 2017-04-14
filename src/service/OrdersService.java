package service;

import java.util.List;

import model.Orders;


public interface OrdersService {
	public List<Orders> queryAllOrders();//查询所有订单信息
	public void deleteOrdersById(Integer toid);//通过toid，即主键，删除订单

}
