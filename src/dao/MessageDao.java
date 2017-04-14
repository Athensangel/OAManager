package dao;

import java.util.List;

import model.Message;

public interface MessageDao {
	public List<Message> findAllMessage();//

	public void delMessageById(Integer toid);//通过toid，即主键，

}
