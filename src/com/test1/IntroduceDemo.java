package com.test1;

public class IntroduceDemo {

    //姓名
    private String name;
    //年龄
    private  int  age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void start(){
        System.out.println("bean start");
    }
    public void stop(){
        System.out.println("bean stop");
    }

    /**
     * 自我介绍
     */
    public void intrduce(){
        System.out.println("您好，我叫"+this.name+"今年"+this.age+"岁！");
    }

//    @Override
//    public void destroy() throws Exception {
//        System.out.println("bean destroy");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("bean afterPropertiesSet");
//    }

    public void defaultInit(){
        System.out.println("bean defaultinit");
    }

    public void defaultDestroy(){
        System.out.println("bean default destroy");
    }
}
