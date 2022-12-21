package com.bc.db;


import com.bc.bean.User;
// Strategy抽象策略角色
public interface UserStrategy {
    public User CreateUser(String userid, String username, String userpassword);
}
