package service;

import java.util.List;

import model.User;

public interface UserService {
	public User checkUserLogin(String username,String password);
	public List<User> queryAllUsers();//查询所有员工信息
	public void deleteUserById(Integer toid);//通过toid，即主键，删除员工
}
