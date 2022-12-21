package com.bc.db;
// 具体构件（ConcreteComponent）
public class BaseRoom extends RoomInfo{
    @Override
   public String getRoomInfo() {
        return "基础房间";
    }

    @Override
    public  int getPrice() {
        return 199;
    }
}
