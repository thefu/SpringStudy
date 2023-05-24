package com.sicauthefu.springtest;

import com.sicauthefu.springtest.config.BeansConfig;
import com.sicauthefu.springtest.entity.User;
import com.sicauthefu.springtest.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        // create and configure beans
//        ApplicationContext context = new ClassPathXmlApplicationContext("aspects.xml", "daos.xml", "services.xml");

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.sicauthefu.springtest");
        //如果没有Spring框架，我们需要自己创建User/Dao/Service等，但是有了Spring框架，可以将原有bean的创建工作转给框架，需要时从Bean的容器中获取即可

        // retrieve configured instance
        UserServiceImpl service = context.getBean(UserServiceImpl.class);

        // use configured instance
        List<User> userList = service.findUserList();

        // print info from beans
        userList.forEach(a -> System.out.println(a.getName() + "," + a.getAge()));
    }
}

/**
 * Spring框架托管创建的Bean放在哪里呢？这边是IOC Container
 *
 * Spring框架为了更好让用户配置bean，必然会引入不同方式来配置bean，这边是xml配置，java配置，注解配置等支持。
 *
 * 应用程序代码从Ioc Container中获取依赖的bean，注入到应用程序中，这个过程叫做依赖注入，（DI）所以说控制翻转是通过依赖注入实现的，其实他们是同一个概念的不同角度描述，通俗来说就是Ioc是设计思想，DI是实现方式
 */