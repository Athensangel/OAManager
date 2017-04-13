package dao;

import model.User;

public interface UserDao {
	public User checkLogin(String username,String password);
}
