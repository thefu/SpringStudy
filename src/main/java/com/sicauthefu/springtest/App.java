package com.sicauthefu.springtest;

import com.sicauthefu.springtest.entity.User;
import com.sicauthefu.springtest.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        // create and configure beans
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aspects.xml", "daos.xml", "services.xml");

        // retrieve configured instance
        UserServiceImpl service = context.getBean("userService", UserServiceImpl.class);

        // use configured instance
        List<User> userList = service.findUserList();

        // print info from beans
        userList.forEach(a -> System.out.println(a.getName() + "," + a.getAge()));
    }
}
