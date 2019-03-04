package com.test1.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        //创建Spring上下文（加载bean.xml）
        ApplicationContext acx= new ClassPathXmlApplicationContext("classpath:spring-autowiring.xml");
        //获取HelloWorld实例
        AutoWiringService id= acx.getBean("autoWiringService",AutoWiringService.class);
        id.say("this is a test");
    }
}
