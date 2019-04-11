package com.example.demo.data.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by fdzapo on 27-Feb-19.
 */
@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String username;

    private String password;

    @ManyToOne(targetEntity = Role.class)
    @JoinColumn(name = "RoleId", nullable = false)
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @OneToMany(mappedBy = "user")
    private List<Session> sessions;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }
}
