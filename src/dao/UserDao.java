package dao;

import java.util.List;

import model.User;
/**
 * 员工dao
 * @author Administrator
 *
 */
public interface UserDao {
	public User checkLogin(String username,String password);

	public List<User> findAllUsers(String realname);//查询所有员工信息

	public void delUserById(Integer toid);//通过toId，即主键，删除员工

	public void insertUser(User user);//新增员工

	public User findUserById(Integer toid);//通过toId查询员工

	public void updateUserById(User user);//通过toId修改员工

	public void updateUserInfo(User user);//修改信息
	
	int updateCount(Integer toid);//更新浏览量
	
}
