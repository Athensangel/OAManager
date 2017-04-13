package model;

/**
 * 部门
 * @author Administrator
 *
 */
public class Department {
	private Integer toid; //主键，自动增长
	private String departmentname;//部门名称
	private Integer managerid;//部门经理，来自员工表
	public Integer getToid() {
		return toid;
	}
	public void setToid(Integer toid) {
		this.toid = toid;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public Integer getManagerid() {
		return managerid;
	}
	public void setManagerid(Integer managerid) {
		this.managerid = managerid;
	}

}
