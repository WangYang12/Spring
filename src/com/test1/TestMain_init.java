package com.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain_init {
    public static void main(String[] args) {
    //创建Spring上下文（加载bean.xml）
        ApplicationContext acx= new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        //获取HelloWorld实例
        IntroduceDemo id=acx.getBean("IntrduceDemo",IntroduceDemo.class);
        //调用方法
        id.intrduce();
        ((ClassPathXmlApplicationContext)acx).close();
    }
}
