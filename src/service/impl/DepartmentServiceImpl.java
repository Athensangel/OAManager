package service.impl;

import java.util.List;

import dao.DepartmentDao;
import dao.impl.DepartmentDaoImpl;
import model.Department;
import service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {
	
	private  DepartmentDao departmentDao = new DepartmentDaoImpl();

	@Override
	public List<Department> queryAllDepartment() {
		return departmentDao.findAllDepartment();
	}

}
