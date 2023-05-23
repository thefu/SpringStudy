package com.sicauthefu.springtest.service;

import com.sicauthefu.springtest.dao.UserDaoImpl;
import com.sicauthefu.springtest.entity.User;

import java.util.List;

public class UserServiceImpl {

    private UserDaoImpl userDao;

    public UserServiceImpl() {
    }

    public List<User> findUserList() {
        return this.userDao.findUserList();
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }
}
