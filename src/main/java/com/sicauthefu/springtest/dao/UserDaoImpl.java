package com.sicauthefu.springtest.dao;

import com.sicauthefu.springtest.entity.User;

import java.util.Collections;
import java.util.List;

public class UserDaoImpl {
    public UserDaoImpl(){
    }

    public List<User> findUserList() {
        return Collections.singletonList(new User("tom", 18));
    }
}
