package service.impl;

import java.util.List;

import dao.DepartmentDao;
import dao.impl.DepartmentDaoImpl;
import model.Department;
import service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {
	
	private  DepartmentDao departmentDao = new DepartmentDaoImpl();

	public DepartmentDao getDepartmentDao() {
		return departmentDao;
	}

	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	@Override
	public List<Department> queryAllDepartment() {
		return departmentDao.findAllDepartments();
	}

	@Override
	public void deleteDepartmentById(Integer toid) {
		departmentDao.delDepartmentById(toid);
	}

	@Override
	public void saveDepartment(Department department) {
		departmentDao.insertDepartment(department);
	}

	@Override
	public Department queryDepartmentById(Integer toid) {
		return departmentDao.findDepartmentById(toid);
	}

	@Override
	public void updateDepartment(Department department) {
		departmentDao.updateDepartmentById(department);
	}
}
