package com.bc.db;

import java.util.ArrayList;
import java.util.UUID;

import com.bc.bean.Room;


public class RoomDB {

	private static ArrayList<Room> rooms = new ArrayList<>();
	
	public static String getUUID(){
        UUID uuid=UUID.randomUUID();
        String str = uuid.toString(); 
        String uuidStr=str.replace("-", "");
        return uuidStr;
	}

//	静态代码块，当类被加载的时候，代码块中的代码就会执行，只会执行一次
	static {
		Room r1 = new Room("1","Room1","北京","商务型酒店:",1,"1","七里屯2号","1526889951");
		RoomInfo roomInfo=new BaseRoom();
		System.out.println("房间类型："+roomInfo.getRoomInfo()+"  价格："+roomInfo.getPrice());
		roomInfo=new BedDecorator(roomInfo);
		System.out.println("房间类型："+roomInfo.getRoomInfo()+"  价格："+roomInfo.getPrice());
		// 原型模式生成房间对象
		GenerateRooms(r1,10);
	}
	
	
	//生成多个相同的房间使用原型设计模式number要生成的个数
	public static void GenerateRooms(Room r,int number) {
		for(int i=0;i<number;i++) {
			try {
				Room room = (Room) r.clone();
				room.setRoomid(getUUID());
				room.setRoomname("Room"+(i+1));
				rooms.add(room);
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
//	给外部提供方法获取用户信息
	public static ArrayList<Room> getRooms() {
		
		return rooms;
	}
//	添加房间的方法
	public static void addRoom(Room room) {
//		给新添加的用户
		Room r = room;
		rooms.add(r);
	}
//	根据id查找房间
	public static Room findRoom(String roomid) {
		for (Room r : rooms) {
			if(r.getRoomid().equals(roomid)) {
				return r;
			}
		}
		return null;
	}
	
//	删除房间的方法
	public static void delBook(String roomid) {
//		根据id找出对应的用户，再删除
		Room room = findRoom(roomid);
		rooms.remove(room);
	}
}
