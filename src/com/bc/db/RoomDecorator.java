package com.bc.db;
// 抽象装饰器（Decorator）
public abstract class RoomDecorator extends BaseRoom{

    // 静态代理
    private RoomInfo roomInfo;

    public RoomDecorator(RoomInfo roomInfo){
        this.roomInfo=roomInfo;
    }
    @Override
    public String getRoomInfo(){
        return this.roomInfo.getRoomInfo();
    }

    @Override
    public int getPrice(){
        return this.roomInfo.getPrice();
    }

    // 可以加额外功能方法
    public abstract void addedFunction();
}
