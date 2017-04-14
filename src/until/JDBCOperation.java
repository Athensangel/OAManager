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

	/**
	 * 查询所有员工信息
	 * @return
	 */
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
		//JDBCOperation.findAllUsers();//测试查询
		//JDBCOperation.delUserById(2);//测试删除
		/*User user = new User();
		user.setUsername("username");
		user.setPassword("password");
		user.setRealname("realname");
		JDBCOperation.addUser(user);*/ //测试新增
		JDBCOperation.findUserById(102);
		
	}

	/**
	 * 删除员工
	 * @param toid
	 */
	public static void delUserById(Integer toid) {
	    Connection conn = getConn();
	    String sql = "delete from user where toid= ?"; 
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
	 * @param user
	 */
	public static void addUser(User user) {
	    Connection conn = getConn();
	    String sql = "insert into user (username,password,realname,sex,birthday,email,address,telphone,qq,salary,departid,role) values(?,?,?,?,?,?,?,?,?,?,?,?)"; 
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        pstmt.setString(1,user.getUsername());
	        pstmt.setString(2, user.getPassword());
	        pstmt.setString(3, user.getRealname());
	        pstmt.setString(4,user. getSex());
	        pstmt.setString(5, user.getBirthday());
	        pstmt.setString(6, user.getEmail());
	        pstmt.setString(7,user.getAddress());
	        pstmt.setString(8, user.getTelphone());
	        pstmt.setString(9, user.getQq());
	        pstmt.setFloat(10,user.getSalary());
	        pstmt.setInt(11, user. getDepartid());
	        pstmt.setString(12, user.getRole());
	        pstmt.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	/**
	 * 通过toid查询员工
	 * @param toid
	 * @return
	 */
	public static User findUserById(Integer toid) {
		User user = new User();
	    Connection conn = getConn();
	    String sql = "select * from user where toid=?"; 
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        pstmt.setInt(1,toid);
	        ResultSet rs = pstmt.executeQuery();
	        while (rs.next()) {
	        	user.setToid(rs.getInt(1));
	        	user.setUsername(rs.getString(2));
	        	user.setPassword(rs.getString(3));
		        user.setRealname(rs.getString(4));
		        user.setSex(rs.getString(5));
		        user.setBirthday(rs.getString(6));
		        user.setEmail(rs.getString(7));
		        user.setAddress(rs.getString(8));
		        user.setTelphone(rs.getString(9));
		        user.setQq(rs.getString(10));
		        user.setSalary(rs.getFloat(11));
		        user.setDepartid(rs.getInt(12));
		        user.setRole(rs.getString(13));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return user;
	}

	public static void updateUserById(User user) {
		 Connection conn = getConn();
		    String sql = "update user set username = ?,password = ?,realname = ?,sex = ?,birthday = ?,email = ?,address = ?,telphone = ?,qq = ?,salary = ?,departid = ?,role = ? where toid = ?"; 
		    PreparedStatement pstmt;
		    try {
		        pstmt = (PreparedStatement)conn.prepareStatement(sql);
		        pstmt.setString(1,user.getUsername());
		        pstmt.setString(2, user.getPassword());
		        pstmt.setString(3, user.getRealname());
		        pstmt.setString(4,user. getSex());
		        pstmt.setString(5, user.getBirthday());
		        pstmt.setString(6, user.getEmail());
		        pstmt.setString(7,user.getAddress());
		        pstmt.setString(8, user.getTelphone());
		        pstmt.setString(9, user.getQq());
		        pstmt.setFloat(10,user.getSalary());
		        pstmt.setInt(11, user. getDepartid());
		        pstmt.setString(12, user.getRole());
		        pstmt.setInt(13, user.getToid());
		        pstmt.executeUpdate();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
	}
}
