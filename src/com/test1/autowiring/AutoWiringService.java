package com.test1.autowiring;

public class AutoWiringService {
    private AutoWiringDAO autoWiringDAO;

    public AutoWiringDAO getAutoWiringDAO() {
        return autoWiringDAO;
    }

    public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
        this.autoWiringDAO = autoWiringDAO;
    }

    public void say(String word){
        this.autoWiringDAO.saya(word);
    }
}
