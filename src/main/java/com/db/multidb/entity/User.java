package com.db.multidb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "user",schema = "company")
public class User {
    @Id
    @Column(name = "user_id")
    Long userId;

    @Column(name = "user_name")
    String userName;

    @Column(name = "email_Id")
    String  emailId;
}
