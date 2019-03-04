package com.test1.autowired.service;

import com.test1.autowired.dao.InjectionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InjectionServiceImpl implements InjectionService {

    private InjectionDAO injectionDAO;



    @Override
    public void say(String word) {
        System.out.println( "service : " +word);
        injectionDAO.say(word);
    }

    @Autowired
    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }
}
