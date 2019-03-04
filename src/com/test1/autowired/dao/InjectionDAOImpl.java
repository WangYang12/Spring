package com.test1.autowired.dao;

import org.springframework.stereotype.Repository;

@Repository
public class InjectionDAOImpl implements InjectionDAO {
    @Override
    public void say(String word) {
        System.out.println("DAO : "+ word);
    }
}
