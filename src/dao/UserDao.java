package dao;

import java.util.List;

import model.User;

public interface UserDao {
	public User checkLogin(String username,String password);

	public List<User> findAllUsers();//查询所有员工信息
	
}
