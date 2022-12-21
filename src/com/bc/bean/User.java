package com.bc.bean;

import java.util.ArrayList;


public class User {
	private String userid;
	private String username;
	private String userpassword;
	private int usertype;
	private ArrayList<String> ordroom;


	public User(){
		super();
	}
	public ArrayList<String> getOrdroom() {
		if (ordroom==null){
			ordroom=new ArrayList<>();
			ordroom.add("Room1");
			ordroom.add("Room2");
			return ordroom;
		}
		return ordroom;
	}
	public void setOrdroom(ArrayList<String> ordroom) {
		this.ordroom = ordroom;
	}


	public User(String userid, String username, String userpassword, int usertype) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpassword = userpassword;
		this.usertype = usertype;
	}



	



	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", userpassword=" + userpassword + ", usertype="
				+ usertype + "]";
	}



	public String getId() {
		return userid;
	}
	public void setId(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsernam(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public int getUsertype() {
		return usertype;
	}
	public void setUsertype(int usertype) {
		this.usertype = usertype;
	}
	
	
}
