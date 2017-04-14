package dao.impl;

import java.util.List;

import dao.UserDao;
import model.User;
import until.JDBCOperation;

public class UserDaoImpl implements UserDao {

	@Override
	public User checkLogin(String username, String password) {
		return JDBCOperation.checkLogin(username, password);
	}

	@Override
	public List<User> findAllUsers() {
		return JDBCOperation.findAllUsers();
	}

	@Override
	public void delUserById(Integer toid) {
		JDBCOperation.delUserById(toid);
	}


}
