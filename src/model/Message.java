package model;

public class Message {
	private Integer toid; //主键，自动增长
	private Integer from_id; //发信人，来自员工表
	private Integer to_id; //收信人，来自员工表
	private String  content; //信息内容
	private Character isread; //是否已读，0----未读  1---已读
	public Integer getToid() {
		return toid;
	}
	public void setToid(Integer toid) {
		this.toid = toid;
	}
	public Integer getFrom_id() {
		return from_id;
	}
	public void setFrom_id(Integer from_id) {
		this.from_id = from_id;
	}
	public Integer getTo_id() {
		return to_id;
	}
	public void setTo_id(Integer to_id) {
		this.to_id = to_id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Character getIsread() {
		return isread;
	}
	public void setIsread(Character isread) {
		this.isread = isread;
	}
}
