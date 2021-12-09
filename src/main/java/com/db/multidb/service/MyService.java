package com.db.multidb.service;

import com.db.multidb.dao.UserHibernateDao;
import com.db.multidb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Service
public class MyService {

    @Autowired
    UserHibernateDao userHibernateDao;

    public void processDelete(){
        List<String> emailAddresses = Arrays.asList("test@test.com");
        List<User> users = userHibernateDao.findAll();

        System.out.println(users);


    }
}
