package com.db.multidb.service;

import com.db.multidb.dao.mysql.StudentRepository;
import com.db.multidb.dao.postgres.UserRepository;
import com.db.multidb.entity.mysql.Student;
import com.db.multidb.entity.postgres.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Service
public class MyService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    StudentRepository studentRepository;

    public void processDelete(){
//        List<String> emailAddresses = Arrays.asList("test@test.com");
        List<User> users = userRepository.findAll();
        System.out.println(users);

        List<Student> students = studentRepository.findAll();
        System.out.println(students);


    }
}
