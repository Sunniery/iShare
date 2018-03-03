package org.starrier.ishare.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author Starrier
 * @Time 2018/3/3.
 */
@Data
@Entity
@Table(name = "t_user")
public class User {
    @Id
    @Column(name = "id")
    private int id;
    private String userName;
    private  String password;
}
