package dao;

import java.util.List;

import model.Department;

/**
 * 部门Dao
 * @author Administrator
 *
 */
public interface DepartmentDao {
	public List<Department> findAllDepartment(); //查询部门
}
