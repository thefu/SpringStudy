package com.sicauthefu.springtest.config;

import com.sicauthefu.springtest.aspect.LogAspect;
import com.sicauthefu.springtest.dao.UserDaoImpl;
import com.sicauthefu.springtest.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class BeansConfig {

//    @Bean("userDao")
//    public UserDaoImpl userDao() {
//        return new UserDaoImpl();
//    }
//
//    @Bean("userService")
//    public UserServiceImpl userService() {
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.setUserDao(userDao());
//        return userService;
//    }
//
//    @Bean("logAspect")
//    public LogAspect logAspect() {
//        return new LogAspect();
//    }
}
