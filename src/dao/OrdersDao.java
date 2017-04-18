package dao;

import java.util.List;

import model.Orders;

/**
 * 实现OrdersDao
 * @author Administrator
 *
 */
public interface OrdersDao {
	public List<Orders> findAllOrders();//查询所有订单信息

	public void delOrdersById(Integer toid);//通过toId，即主键，删除订单
	
	public Orders findOrdersById(Integer toid);//通过toId，即主键，查找订单

	public void updateOrdersById(Orders orders);//通过toId，即主键，修改订单

	public void saveOrders(Orders order);//通过toId，即主键，添加订单

}
