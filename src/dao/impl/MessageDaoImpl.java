package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 * 部门dao实现类
 * @author cc
 *
 */

import dao.MessageDao;
import model.Message;
import until.JDBCOperation;

public class MessageDaoImpl implements MessageDao {

	@Override
	public List<Message> findAllMessage() {
		Connection conn = JDBCOperation.getConn();
		List<Message> messageList = new ArrayList<Message>();
	    String sql = "select * from message"; //查询Message表里的字段
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	        while (rs.next()) {
	        	Message message = new Message();
	        	message.setId(rs.getInt(1));
	        	message.setToId(rs.getInt(2));
	        	message.setFromId(rs.getInt(3));
	        	message.setContent(rs.getString(4));
	        	message.setIsRead(rs.getString(5));//对应Message表中实体层的字段
	        	messageList.add(message);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return messageList;
	}
	/**
	 * 通过toId,来删除Message表中的字段
	 */
	@Override
	public void delMessageById(Integer toid) {
		Connection conn = JDBCOperation.getConn();
	    String sql = "delete from message where id= ?"; 
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        pstmt.setInt(1,toid);
	        pstmt.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	/**
	 * 新增Message
	 */
	@Override
	public void insertMessage(Message message) {
		// TODO Auto-generated method stub
		Connection conn = JDBCOperation.getConn();
	    String sql = "insert into message (from_id,to_id,content,isread) values(?,?,?,?)"; 
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        pstmt.setInt(1,message.getToId());
	        pstmt.setInt(2,message.getFromId() );
	        pstmt.setString(3,message.getContent());
	        pstmt.setString(4,message.getIsRead());
	        pstmt.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	/**
	 * 通过toId查询信息
	 * @param toid
	 * @return
	 */
	@Override
	public Message findMessageById(Integer toid) {
		Connection conn = JDBCOperation.getConn();
		Message message = new Message();
	    String sql = "select * from message where id=?"; 
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        pstmt.setInt(1,toid);
	        ResultSet rs = pstmt.executeQuery();
	        while (rs.next()) {
	        	message.setId(rs.getInt(1));
	        	message.setToId(rs.getInt(2));
	        	message.setFromId(rs.getInt(3));
		        message.setContent(rs.getString(4));
		        message.setIsRead(rs.getString(5));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return message;
	}

	/**
	 * 通过toId修改信息
	 * @param toid
	 * @return
	 */
	@Override
	public void updateMessageById(Message message) {
		Connection conn = JDBCOperation.getConn();
	    String sql = "update message set from_id = ?,to_id = ?,content = ?,isread = ? where id = ?"; 
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        pstmt.setInt(1,message.getFromId() );
	        pstmt.setInt(2,message.getToId());
	        pstmt.setString(3,message.getContent());
	        pstmt.setString(4,message.getIsRead());
	        pstmt.setInt(5, message.getId());
	        pstmt.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

}
