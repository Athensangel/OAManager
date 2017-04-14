package service.impl;

import java.util.List;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import model.User;
import service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao userDao  = new UserDaoImpl();

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User checkUserLogin(String username, String password) {
		return userDao.checkLogin(username, password);
	}

	@Override
	public List<User> queryAllUsers() {
		return userDao.findAllUsers();
	}

}
