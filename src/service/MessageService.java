package service;

import java.util.List;

import model.Message;

public interface MessageService {
	public List<Message> queryAllMessage();//查询所有信息信息
	public void deleteMessageById(Integer toid);//通过toId，即主键，删除信息
	public void saveMessage(Message message);//新增信息
	public Message queryMessageById(Integer toid);//通过toId,查询信息
	public void updateMessage(Message message);//修改员工
}
