/*
package com.db.multidb.dao;

import com.db.multidb.entity.postgres.User;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserHibernateDao extends AbstractDao<User,Long> implements UserDao {

    @Override
    protected Session getSession() {
        Configuration configuration = new Configuration().configure("hibernate-postgres.cfg.xml");
        return configuration.buildSessionFactory().getCurrentSession();
    }

    @Override
    public List<User> findByFirstName(String firstName) {
        Configuration configuration = new Configuration();
        this.setSession(configuration.configure("hibernate-postgres.cfg.xml").buildSessionFactory().getCurrentSession());
        //add implementation here...
        return null;
    }

    @Override
    public List<User> findByEmail(String email) {

        return null;
    }
}
*/
