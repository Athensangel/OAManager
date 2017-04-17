package dao;

import java.util.List;

import model.Message;

public interface MessageDao {
	public List<Message> findAllMessage();//查询Message表里的信息

	public void delMessageById(Integer toid);//通过toId，即主键，删除字段
	
	public void insertMessage(Message message);//在message表中插入一条字段
	
	public Message findMessageById(Integer toid);//在message表中查找一条字段

	public void updateMessageById(Message message);//在message表中更新字段
}
