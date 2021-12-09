package com.db.multidb.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory = buildSessionFactory();
    private static SessionFactory buildSessionFactory(){
        try{
            Configuration configuration = new Configuration();
            return configuration.configure().buildSessionFactory();
//      return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());
        } catch(Exception Ex){
            Ex.printStackTrace();
            throw new RuntimeException("Error building SessionFactory.");
        }
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
