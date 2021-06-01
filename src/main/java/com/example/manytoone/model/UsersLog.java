package com.example.manytoone.model;

import javax.persistence.*;

@Table(name = "users_log")
@Entity
public class UsersLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "log_id")
    private Integer id;

    private String log;

    @Column(name = "user_id")
    private Integer userId;

    @ManyToOne(cascade = CascadeType.ALL,optional = false)
    @JoinColumn(name = "log_id", referencedColumnName = "user_id",insertable = false,updatable = false)
    private Users users;

    public UsersLog() {
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }
}
