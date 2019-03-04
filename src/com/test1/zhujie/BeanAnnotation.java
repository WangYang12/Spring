package com.test1.zhujie;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope
@Component
public class BeanAnnotation {
    public void say(String word){
        System.out.println("BeanAnnotation : "+word);
    }
}
