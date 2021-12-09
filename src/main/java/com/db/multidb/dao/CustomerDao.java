package com.db.multidb.dao;

import com.db.multidb.entity.Customer;

import java.util.List;

public interface CustomerDao extends Dao<Customer,Long>{
    public List<Customer> findByFirstName(String firstName);
}
