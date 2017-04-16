package service;

import java.util.List;

import model.Department;

/**
 * 部门Service
 * @author Administrator
 *
 */
public interface DepartmentService {
	public List<Department> queryAllDepartment();//查询所有员工信息
	public void deleteDepartmentById(Integer toid);//通过toid，即主键，删除员工
	public void saveDepartment(Department department);//新增员工
	public Department queryDepartmentById(Integer toid);//通过toid查找员工
	public void updateDepartment(Department department);//修改员工

}
