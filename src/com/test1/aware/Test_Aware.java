package com.test1.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Aware {
    public static void main(String[] args) {
        ApplicationContext acx= new ClassPathXmlApplicationContext("classpath:spring-aware.xml");
//        ZiApplicationContext zi = acx.getBean("ZiApplicationContext",ZiApplicationContext.class);
//        System.out.println("Test_Aware"+zi.hashCode());
        BeanName zi = acx.getBean("beanName",BeanName.class);
        System.out.println(zi);
    }
}
