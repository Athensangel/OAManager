package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DepartmentDao;
import model.Department;
import until.JDBCOperation;

/**
 * 部门Dao实现
 * @author Administrator
 *
 */
public class DepartmentDaoImpl implements DepartmentDao {



	@Override
	public List<Department> findAllDepartments() {
		Connection conn = JDBCOperation.getConn();
		List<Department> departmentList = new ArrayList<Department>();
	    String sql = "select * from Department"; 
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	        while (rs.next()) {
	        	Department department = new Department();
	        	department.setToid(rs.getInt(1));
	        	department.setDepartmentname(rs.getString(2));
	        	department.setManagerid(rs.getInt(3));
	        	departmentList.add(department);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return departmentList;
	}

	@Override
	public void delDepartmentById(Integer toid) {
		// TODO Auto-generated method stub
		Connection conn = JDBCOperation.getConn();
	    String sql = "delete from department where toid= ?"; 
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        pstmt.setInt(1,toid);
	        pstmt.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	@Override
	public void insertDepartment(Department department) {
		Connection conn = JDBCOperation.getConn();
	    String sql = "insert into department (departmentname,managerid) values(?,?)"; 
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        pstmt.setString(1,department.getDepartmentname());
	        pstmt.setFloat(2, department.getManagerid());
	        pstmt.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	@Override
	public Department findDepartmentById(Integer toid) {
		Connection conn = JDBCOperation.getConn();
		Department department = new Department();
	    String sql = "select * from department where toid=?"; 
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        pstmt.setInt(1,toid);
	        ResultSet rs = pstmt.executeQuery();
	        while (rs.next()) {
	        	department.setToid(1);
	        	department.setDepartmentname(rs.getString(2));
	        	department.setManagerid(rs.getInt(3));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return department;
	}

	@Override
	public void updateDepartmentById(Department department) {
		Connection conn = JDBCOperation.getConn();
	    String sql = "update department set departmentname = ?,managerid = ? where toid = ?"; 
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        pstmt.setString(1,department.getDepartmentname());
	        pstmt.setFloat(2, department.getManagerid());
	        pstmt.setInt(3, department.getToid());
	        pstmt.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}


}
