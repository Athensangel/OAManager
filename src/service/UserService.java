package service;

import java.util.List;

import model.User;

/**
 * 员工service
 * @author Administrator
 *
 */
public interface UserService {
	public User checkUserLogin(String username,String password);//登陆验证
	public List<User> queryAllUsers(String realname);//查询所有员工信息
	public void deleteUserById(Integer toid);//通过toid，即主键，删除员工
	public void saveUser(User user);//新增员工
	public User queryUserById(Integer toid);//通过toid查找员工
	public void updateUser(User user);//修改员工
	public void updateUserInfo(User user);//修改员工
	int updateCount(Integer toid);//更新浏览量
	
}
