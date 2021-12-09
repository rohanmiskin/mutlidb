package com.db.multidb.entity.mysql;

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
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "student_id")
    Long studentid;

    @Column(name = "student_name")
    String studentName;

    @Column(name = "email_addr")
    String  emailAddr;
}
