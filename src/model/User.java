package model;
/**
 * users表所对应的实体类
 * @author Administrator
 *
 */
public class User {
    //实体类的属性和表的字段名称一一对应
	private Integer toid; //主键，自动增长
	private String username;//账号
	private String password;//密码
	private String realname;//真实姓名
	private String sex;//性别，1表示男，0表示女
	private String birthday;//生日
	private String email;//电子邮箱
	private String address;//住址
	private String telphone;//电话号码
	private String qq;//qq号码
	private Float  salary;//薪水
	private Integer departid;//所属部门，来自department表
	private String role;//admin---管理员  manager---部门经理   saler---普通员工（销售人员）
	
	public  Integer getToid() {
		return toid;
	}
	public void setToid(Integer toid) {
		this.toid = toid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	public Integer getDepartid() {
		return departid;
	}
	public void setDepartid(Integer departid) {
		this.departid = departid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
