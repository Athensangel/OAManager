package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.OrdersDao;
import model.Orders;
import until.JDBCOperation;

public class OrdersDaoImpl implements OrdersDao {

	/**
	 * 查询所有订单信息
	 * @return
	 */
	@Override
	public List<Orders> findAllOrders() {
		Connection conn = JDBCOperation.getConn();
		List<Orders> ordersList = new ArrayList<Orders>();
	    String sql = "select * from orders"; 
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	        while (rs.next()) {
	        	Orders orders = new Orders();
	        	orders.setToid(rs.getInt(1));
	        	orders.setCustName(rs.getString(2));;
	        	orders.setCustAddress(rs.getString(3));
	        	orders.setCustPhone(rs.getString(4));
	        	orders.setCustEmail(rs.getString(5));
	        	orders.setOderTime(rs.getString(6));
	        	orders.setProductId(rs.getInt(7));
	        	orders.setProductCount(rs.getInt(8));
	        	orders.setMoney(rs.getFloat(9));
	        	orders.setCreateTime(rs.getString(10));
	        	orders.setUserId(rs.getInt(11));
	        	ordersList.add(orders);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return ordersList;
	}
	/**
	 * 通过toId删除所找到订单信息
	 * @return
	 */
	@Override
	public void delOrdersById(Integer toid) {
		Connection conn = JDBCOperation.getConn();  //连接数据库
		String sql = "delete from orders where toid= ?";//用sql语句查找orders表中的主键并进行删除操作
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        pstmt.setInt(1,toid);
	        pstmt.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	/**
	 * 新增订单
	 * @param user
	 */
	@Override
	public void saveOrders(Orders orders) {
		Connection conn = JDBCOperation.getConn();
	    String sql = "insert into orders (custname,custaddress,custphone,custemail,odertime,productid,productcount,money,createtime,userid) values(?,?,?,?,?,?,?,?,?,?)"; 
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        pstmt.setString(1,orders.getCustName());
	        pstmt.setString(2,orders.getCustAddress());
	        pstmt.setString(3,orders.getCustPhone());
	        pstmt.setString(4,orders.getCustEmail());
	        pstmt.setString(5,orders.getOderTime());
	        pstmt.setInt(6,orders.getProductId());
	        pstmt.setInt(7,orders.getProductCount());
	        pstmt.setFloat(8,orders.getMoney());
	        pstmt.setString(9,orders.getCreateTime());
	        pstmt.setInt(10,orders.getUserId());
	        pstmt.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	/**
	 * 通过toId查询订单
	 * @param toid
	 * @return
	 */
	@Override
	public Orders findOrdersById(Integer toid) {
		Connection conn = JDBCOperation.getConn();
		Orders orders = new Orders();
	    String sql = "select * from orders where toid=?"; 
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        pstmt.setInt(1,toid);
	        ResultSet rs = pstmt.executeQuery();
	        while (rs.next()) {
	        	orders.setToid(rs.getInt(1));
	        	orders.setCustName(rs.getString(2));
	        	orders.setCustAddress(rs.getString(3));
	        	orders.setCustPhone(rs.getString(4));
	        	orders.setCustEmail(rs.getString(5));
	        	orders.setOderTime(rs.getString(6));
	        	orders.setProductId(rs.getInt(7));
	        	orders.setProductCount(rs.getInt(8));
	        	orders.setMoney(rs.getFloat(9));
	        	orders.setCreateTime(rs.getString(10));
	        	orders.setUserId(rs.getInt(11));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return orders;
	}
	/**
	 * 通过toId修改订单
	 * @param toid
	 * @return
	 */
	@Override
	public void updateOrdersById(Orders orders) {
		Connection conn = JDBCOperation.getConn();
	    String sql = "update orders set custName = ?,custAddress = ?,custPhone = ?,custEmail = ?,oderTime = ?,productId = ?,productCount = ?,money = ?,createTime = ?,userId = ? where toid = ?"; 
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        pstmt.setString(1,orders.getCustName());
	        pstmt.setString(2,orders.getCustAddress());
	        pstmt.setString(3,orders.getCustPhone());
	        pstmt.setString(4,orders.getCustEmail());
	        pstmt.setString(5,orders.getOderTime());
	        pstmt.setInt(6,orders.getProductId());
	        pstmt.setInt(7,orders.getProductCount());
	        pstmt.setFloat(8,orders.getMoney());
	        pstmt.setString(9,orders.getCreateTime());
	        pstmt.setInt(10,orders.getUserId());
	        pstmt.setInt(11, orders.getToid());
	        pstmt.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}


}
