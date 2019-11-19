package com.neuedu.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 普通的属性赋值方式
//        User user = new User();
//        user.setName("小强");
//        user.SayHello();

        // 用配置的方式
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
        User user = (User) ctx.getBean("user");
        System.out.println(user.getName());
        user.SayHello();



    }
}
