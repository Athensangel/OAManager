package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.UserDao;
import model.User;
import until.JDBCOperation;

/**
 * 员工dao实现类
 * @author Administrator
 *
 */
public class UserDaoImpl implements UserDao {

	@Override
	public User checkLogin(String username, String password) {
		 Connection conn = JDBCOperation.getConn();
		 User user = new User();
		    String sql = "select * from user where username=? and password=?"; 
		    PreparedStatement pstmt;
		    try {
		        pstmt = (PreparedStatement)conn.prepareStatement(sql);
		        pstmt.setString(1,username);
		        pstmt.setString(2,password);
		        ResultSet rs = pstmt.executeQuery();
		        while (rs.next()) {
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
	@Override
	public List<User> findAllUsers(String realname) {
		Connection conn = JDBCOperation.getConn();
		List<User> userList = new ArrayList<User>();
		StringBuffer stringBuffer = new StringBuffer("select * from user a ");
		if(realname !=null){
			stringBuffer.append("WHERE a.realname LIKE ?");
		}
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(stringBuffer.toString());
	        if(realname !=null){
	        	pstmt.setString(1, "%" + realname + "%" );
			}
	        ResultSet rs = pstmt.executeQuery();
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


	/**
	 * 删除员工
	 * @param toid
	 */
	@Override
	public void delUserById(Integer toid) {
		Connection conn = JDBCOperation.getConn();
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
	@Override
	public void insertUser(User user) {
		Connection conn = JDBCOperation.getConn();
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
	@Override
	public User findUserById(Integer toid) {
		Connection conn = JDBCOperation.getConn();
		User user = new User();
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
		        user.setCount(rs.getInt(15));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return user;
	}


	/**
	 * 通过toid修改员工
	 * @param toid
	 * @return
	 */
	@Override
	public void updateUserById(User user) {
		Connection conn = JDBCOperation.getConn();
	    String sql = "update user set username = ?,password = ?,realname = ?,sex = ?,birthday = ?,email = ?,address = ?,telphone = ?,qq = ?,salary = ?,departid = ?,role = ? where toid = ?"; 
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        pstmt.setString(1,user.getUsername());		//setString 是为第一个参数设置一个 string 类型的值testNumber
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

	@Override
	public void updateUserInfo(User user) {
		Connection conn = JDBCOperation.getConn();
	    String sql = "update user set username = ?,password = ? where toid = ?"; 
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        pstmt.setString(1,user.getUsername());
	        pstmt.setString(2, user.getPassword());
	        pstmt.setInt(3, user.getToid());
	        pstmt.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	@Override
	public int updateCount(Integer toid) {
		Connection conn = JDBCOperation.getConn();
	    String sql = "update user set count = count+1 where toid = ?"; 
	    PreparedStatement pstmt;
	    int result = 0;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        pstmt.setInt(1,toid);
	        result = pstmt.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
		return result;
	}


}
