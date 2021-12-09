package com.db.multidb.dao;

import com.db.multidb.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserHibernateDao extends AbstractDao<User,Long> implements UserDao {
    @Override
    public List<User> findByFirstName(String firstName) {
        //add implementation here...
        return null;
    }

    @Override
    public List<User> findByEmail(String email) {

        return null;
    }
}
