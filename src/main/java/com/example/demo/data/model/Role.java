package com.example.demo.data.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by fdzapo on 27-Feb-19.
 */
@Entity
@Table(name = "ROLE")
public class Role {
    @Id
    @Column(name = "Id")
    @GeneratedValue
    private Long id;

    @Column(name = "Name")
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

