package com.db.multidb.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;

import javax.sql.DataSource;

@org.springframework.context.annotation.Configuration
public class DatabaseConfig {
    /*@Bean("postgresDatasource")
    @ConfigurationProperties(prefix = "spring.postgres")
    public DataSource postgresDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean("postgresSessionFactory")
    public SessionFactory getPostgresSessionFactory(@Qualifier("postgresDatasource") DataSource dataSource){
        Configuration configuration = new LocalSessionFactoryBuilder(dataSource);
        return configuration.configure().buildSessionFactory();
    }*/
}
