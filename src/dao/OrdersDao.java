package dao;

import java.util.List;

import model.Orders;


public interface OrdersDao {
	public List<Orders> findAllOrders();//查询所有订单信息

	public void delOrdersById(Integer toid);//通过toid，即主键，删除订单

}
