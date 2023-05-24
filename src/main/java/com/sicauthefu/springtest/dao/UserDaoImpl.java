package com.sicauthefu.springtest.dao;

import com.sicauthefu.springtest.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class UserDaoImpl {
    public UserDaoImpl(){
    }

    public List<User> findUserList() {
        return Collections.singletonList(new User("tom", 18));
    }
}
