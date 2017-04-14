package dao;

import java.util.List;

import model.User;

public interface UserDao {
	public User checkLogin(String username,String password);

	public List<User> findAllUsers();//查询所有员工信息

	public void delUserById(Integer toid);//通过toid，即主键，删除员工
	
}
