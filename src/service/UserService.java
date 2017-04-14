package service;

import java.util.List;

import model.User;

public interface UserService {
	public User checkUserLogin(String username,String password);
	public List<User> queryAllUsers();//查询所有员工信息
}
