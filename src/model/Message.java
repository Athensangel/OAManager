package model;


public class Message {
	private Integer id; //主键，自动增长
	private Integer fromId; //发信人，来自员工表
	private Integer toId; //收信人，来自员工表
	private String  content; //信息内容
	private String isRead; //是否已读，0----未读  1---已读
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getFromId() {
		return fromId;
	}
	public void setFromId(Integer fromId) {
		this.fromId = fromId;
	}
	public Integer getToId() {
		return toId;
	}
	public void setToId(Integer toId) {
		this.toId = toId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getIsRead() {
		return isRead;
	}
	public void setIsRead(String isRead) {
		this.isRead = isRead;
	}

}
