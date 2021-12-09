package com.db.multidb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer",schema = "company")
public class Customer {
    @Id
    @Column(name = "customer_id")
    Long customerId;

    @Column(name = "customer_name")
    String customerName;

    @Column(name = "email_address")
    String  emailAddress;
}
