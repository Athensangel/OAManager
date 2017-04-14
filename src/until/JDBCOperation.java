package until;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.User;

public class JDBCOperation {
	private static Connection getConn() {
	    String driver = "com.mysql.jdbc.Driver";
	    String url = "jdbc:mysql://127.0.0.1:3306/sifei";
	    String username = "root";
	    String password = "root";
	    Connection conn = null;
	    try {
	        Class.forName(driver); //classLoader,加载对应驱动
	        conn = (Connection) DriverManager.getConnection(url, username, password);
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return conn;
	}
	
	public static User checkLogin(String username, String password) {
		User user = new User();
	    Connection conn = getConn();
	    String sql = "select * from user where username=? and password=?"; 
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        pstmt.setString(1,username);
	        pstmt.setString(2,password);
	        ResultSet rs = pstmt.executeQuery();
	        //int col = rs.getMetaData().getColumnCount();
	        while (rs.next()) {
	         /*   for (int i = 1; i <= col; i++) {
	                System.out.print(rs.getString(i) + "\t");
	                if ((i == 2) && (rs.getString(i).length() < 8)) {
	                    System.out.print("\t");
	                }
	             }*/
	        	user.setToid(rs.getInt(1));
	        	user.setUsername(rs.getString(2));
	        	user.setPassword(rs.getString(3));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return user;
	}

	public static List<User> findAllUsers() {
		List<User> userList = new ArrayList<User>();
	    Connection conn = getConn();
	    String sql = "select * from user"; 
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	        //int col = rs.getMetaData().getColumnCount();
	        while (rs.next()) {
	        	User user = new User();
	        	user.setToid(rs.getInt(1));
	        	user.setUsername(rs.getString(2));
	        	user.setPassword(rs.getString(3));
	        	user.setRealname(rs.getString(4));
	        	userList.add(user);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return userList;
	}
	
	
	public static void main(String args[]) {
	    //JDBCOperation.checkLogin("ddd1", "aaa1");
		JDBCOperation.findAllUsers();
	}
}
