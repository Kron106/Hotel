package com.bc.db;

public class BedDecorator extends RoomDecorator{
    public BedDecorator(RoomInfo roomInfo) {
        super(roomInfo);
    }

    @Override
    public String getRoomInfo() {
        return super.getRoomInfo() + " 另 + 1个大床";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 50;
    }

    @Override
    public void addedFunction() {
        System.out.println("添加额外功能");
    }
}
