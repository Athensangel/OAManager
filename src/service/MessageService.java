package service;

import java.util.List;

import model.Message;

public interface MessageService {
	public List<Message> queryAllMessage();//查询所有信息信息
	public void deleteMessageById(Integer toid);//通过toid，即主键，删除信息
}
