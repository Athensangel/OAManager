package service.impl;

import java.util.List;
import dao.MessageDao;
import dao.impl.MessageDaoImpl;
import model.Message;
import service.MessageService;

public class MessageServiceImpl implements MessageService {
	private MessageDao messageDao=new MessageDaoImpl();
	public MessageDao getMessageDao() {
		return messageDao;
	}

	public void setMessageDao(MessageDao messageDao) {
		this.messageDao = messageDao;
	}

	@Override
	public List<Message> queryAllMessage() {
		return messageDao.findAllMessage();
	}

	@Override
	public void deleteMessageById(Integer toid) {
		messageDao.delMessageById(toid);
	}

	@Override
	public void saveMessage(Message message) {
		messageDao.insertMessage(message);
	}

	@Override
	public Message queryMessageById(Integer toid) {
		return messageDao.findMessageById(toid);
	}

	@Override
	public void updateMessage(Message message) {
		messageDao.updateMessageById(message);
	}

}
