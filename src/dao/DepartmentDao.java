package dao;

import java.util.List;

import model.Department;

/**
 * 部门Dao
 * @author Administrator
 *
 */
public interface DepartmentDao {
	public List< Department> findAllDepartments();//查询所有产品信息

	public void delDepartmentById(Integer toid);//通过toid，即主键，删除产品

	public void insertDepartment( Department  department);//通过toid，即主键，插入产品
	
	public  Department findDepartmentById(Integer toid);//通过toid，即主键，删除产品

	public void updateDepartmentById( Department  department);//通过toid，即主键，修改产品
}
