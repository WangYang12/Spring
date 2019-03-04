package com.test1.zhujie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext acx= new ClassPathXmlApplicationContext("classpath:spring-beanannotation.xml");
        BeanAnnotation bean = acx.getBean("beanAnnotation",BeanAnnotation.class);
        bean.say("test");

        BeanAnnotation bean2 = acx.getBean("beanAnnotation",BeanAnnotation.class);
        System.out.println(bean.hashCode());
        System.out.println(bean2.hashCode());
    }
}
