package com.bc.db;

import com.bc.bean.User;
// 具体策略角色，具体的算法。  -- 普通用户
public class Common implements UserStrategy{
    @Override
    public User CreateUser(String userid, String username, String userpassword) {
        return new User(userid,username,userpassword,1);
    }
}
