package com.bc.db;

import java.util.ArrayList;
import com.bc.bean.User;
import com.bc.controller.CommenUser;
import com.bc.controller.Context;

public class UserDB {

private static ArrayList<User> users = new ArrayList<>();

	static UserContext Context=null;
//	静态代码块，当类被加载的时候，代码块中的代码就会执行，只会执行一次
	static {
		// 策略模式
		// 普通用户
		Context=new UserContext(new Common());
		User u1 = Context.executeStrategy("111111","User1","123456");
		User u2 = Context.executeStrategy("222222","User2","123456");
		User u3 = Context.executeStrategy("333333","User3","123456");
		User u4 = Context.executeStrategy("444444","User4","123456");
		User u5 = Context.executeStrategy("555555","User5","123456");
		// 管理员用户
		Context=new UserContext(new Admin());
		User a6 = Context.executeStrategy("9","Admin","1");


		ArrayList<String> ordroom = new ArrayList<>();
		ordroom.add("Room1");
		ordroom.add("Room2");
		u1.setOrdroom(ordroom);
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		users.add(u5);
		users.add(a6);
			
	}
	
//	给外部提供方法获取用户信息
	public static ArrayList<User> getUser() {
		return users;
	}
//	添加图书的方法
	public static void addUser(User user) {
//		给新添加的用户
		User un = new User(user.getId(),user.getUsername(),user.getUserpassword(),user.getUsertype());
		users.add(un);
	}
//	根据id查找用户
	public static User findUser(String userid) {
		for (User u : users) {
			if(u.getId().equals(userid)) {
				return u;
			}
		}
		return null;
	}
	
//	删除用户的方法
	public static void delUser(String userid) {
//		根据id找出对应的用户，再删除
		User user = findUser(userid);
		users.remove(user);
	}
}
