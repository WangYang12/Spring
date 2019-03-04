package com.test1.autowired.test;

import com.test1.autowired.service.InjectionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Autowired {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-beanannotation.xml");

        InjectionService service = ac.getBean("injectionServiceImpl",InjectionService.class);
        service.say("this is a test");
    }
}
