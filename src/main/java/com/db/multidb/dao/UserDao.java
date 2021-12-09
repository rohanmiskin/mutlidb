package com.db.multidb.dao;

import com.db.multidb.entity.User;

import java.util.List;

public interface UserDao extends Dao<User,Long>{
    public List<User> findByFirstName(String firstName);
    public List<User> findByEmail(String email);
}
