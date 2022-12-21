package com.bc.bean;

import java.io.*;
import java.sql.Time;


public class Room implements Cloneable,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String roomid;
	private String roomname;
	private String city;
	private String type;
	private int level;
	private String status;
	private String address;
	private String connection;
	private Time leave;
	private Time in;
	
	public Room() {
		super();
	}
	
	
	
	public Room(String roomid, String roomname, String city, String type, int level, String status, String address,
			String connection, Time leave, Time in) {
		super();
		this.roomid = roomid;
		this.roomname = roomname;
		this.city = city;
		this.type = type;
		this.level = level;
		this.status = status;
		this.address = address;
		this.connection = connection;
		this.leave = leave;
		this.in = in;
	}

	public Room(String roomid, String roomname, String city, String type, int level, String status, String address,
			String connection) {
		super();
		this.roomid = roomid;
		this.roomname = roomname;
		this.city = city;
		this.type = type;
		this.level = level;
		this.status = status;
		this.address = address;
		this.connection = connection;

	}


	public String getRoomid() {
		return roomid;
	}
	public void setRoomid(String roomid) {
		this.roomid = roomid;
	}
	public String getRoomname() {
		return roomname;
	}
	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getConnection() {
		return connection;
	}
	public void setConnection(String connection) {
		this.connection = connection;
	}
	public Time getLeave() {
		return leave;
	}
	public void setLeave(Time leave) {
		this.leave = leave;
	}
	public Time getIn() {
		return in;
	}
	public void setIn(Time in) {
		this.in = in;
	}



	@Override
	public String toString() {
		return "Room [roomid=" + roomid + ", roomname=" + roomname + ", city=" + city + ", type=" + type + ", level="
				+ level + ", status=" + status + ", address=" + address + ", connection=" + connection + ", leave="
				+ leave + ", in=" + in + "]";
	}
	
	//id、酒店名称、所在城市、酒店类型、星级、入住状态、入住时间、离店时间、酒店详细地址、酒店介绍、联系方式

	 /* 浅复制 */
	  public Object clone() throws CloneNotSupportedException {
	        Room proto = (Room) super.clone();
	        return proto;
	    }
	  
	  /* 深复制 */
	    public Object deepClone() throws IOException, ClassNotFoundException {

	        /* 写入当前对象的二进制流 */
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();
	        ObjectOutputStream oos = new ObjectOutputStream(bos);
	        oos.writeObject(this);

	        /* 读出二进制流产生的新对象 */
	        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
	        ObjectInputStream ois = new ObjectInputStream(bis);
	        return ois.readObject();
	    }
	
	
}
