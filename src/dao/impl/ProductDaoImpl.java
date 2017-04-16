package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ProductDao;
import model.Product;
import until.JDBCOperation;

public class ProductDaoImpl implements ProductDao {
	/**
	 * 查询所有员工信息
	 * @return
	 */
	@Override
	public List<Product> findAllProducts() {
		Connection conn = JDBCOperation.getConn();
		List<Product> productList = new ArrayList<Product>();
	    String sql = "select * from product"; 
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	        while (rs.next()) {
	        	Product product = new Product();
	        	product.setToid(rs.getInt(1));
	        	product.setProductName(rs.getString(2));
	        	product.setPrice(rs.getFloat(3));
	        	productList.add(product);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return productList;
	}


	/**
	 * 删除员工
	 * @param toid
	 */
	@Override
	public void delProductById(Integer toid) {
		Connection conn = JDBCOperation.getConn();
	    String sql = "delete from product where toid= ?"; 
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
	 * 新增员工
	 * @param product
	 */
	@Override
	public void insertProduct(Product product) {
		Connection conn = JDBCOperation.getConn();
	    String sql = "insert into product (productname,price) values(?,?)"; 
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        pstmt.setString(1,product.getProductName());
	        pstmt.setFloat(2, product.getPrice());
	        pstmt.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
		
	}


}
