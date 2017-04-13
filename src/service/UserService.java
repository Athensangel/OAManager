package service;

import model.User;

public interface UserService {
	public User checkUserLogin(String username,String password);
}
