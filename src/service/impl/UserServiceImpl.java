package service.impl;

import java.util.List;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import model.User;
import service.UserService;

/**
 * 员工servcie实现类
 * @author Administrator
 *
 */
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
	public List<User> queryAllUsers(String realname) {
		return userDao.findAllUsers(realname);
	}

	@Override
	public void deleteUserById(Integer toid) {
		userDao.delUserById(toid);
	}

	@Override
	public void saveUser(User user) {
		userDao.insertUser(user);
		
	}

	@Override
	public User queryUserById(Integer toid) {
		return userDao.findUserById(toid);
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUserById(user);
		
	}

	@Override
	public void updateUserInfo(User user) {
		userDao.updateUserInfo(user);
		
	}

	@Override
	public int updateCount(Integer toid) {
		return userDao.updateCount(toid);
	}

}
