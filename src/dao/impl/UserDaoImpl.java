package dao.impl;

import dao.UserDao;
import model.User;
import until.JDBCOperation;

public class UserDaoImpl implements UserDao {

	@Override
	public User checkLogin(String username, String password) {
		return JDBCOperation.checkLogin(username, password);
	}

}
