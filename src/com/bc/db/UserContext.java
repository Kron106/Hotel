package com.bc.db;


import com.bc.bean.User;
// UserContext角色，上下文角色，封装算法对高层屏蔽，高层模块只用访问Context。
public class UserContext {

    private UserStrategy userStrategy;

    public UserContext(UserStrategy userStrategy) {
        this.userStrategy = userStrategy;
    }

    public User executeStrategy(String userid, String username, String userpassword) {
        return userStrategy.CreateUser(userid, username, userpassword);
    }
}
