package com.db.multidb.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.db.multidb.dao.mysql",
        entityManagerFactoryRef = "mysqlEntityManagerFactory", transactionManagerRef = "mysqlPlatformTransactionManager")

public class MysqlConfig {
    @Bean
    @ConfigurationProperties("spring.mysql")
    public DataSourceProperties mysqlDataSourceProperties() {
        return new DataSourceProperties();
    }
    @Bean
    public DataSource mysqlDataSource(@Qualifier("mysqlDataSourceProperties") DataSourceProperties mysqlDataSourceProperties) {
        return  mysqlDataSourceProperties
                .initializeDataSourceBuilder().build();
    }
    @Bean
    public LocalContainerEntityManagerFactoryBean mysqlEntityManagerFactory(@Qualifier("mysqlDataSource") DataSource mysqlDataSource, EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(mysqlDataSource)
                .packages("com.db.multidb.entity.mysql")
                .persistenceUnit("mysql")
                .build();
    }
    @Bean
    public PlatformTransactionManager mysqlPlatformTransactionManager(@Qualifier("mysqlEntityManagerFactory")EntityManagerFactory mysqlEntityManagerFactory) {
        return new JpaTransactionManager(mysqlEntityManagerFactory);
    }
}
