package com.example.demo.data.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by fdzapo on 27-Feb-19.
 */
@Entity
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @OneToMany(mappedBy = "quiz")
    private List<Question> quiestions;

    @OneToMany(mappedBy = "quiz")
    private List<Session> sessions;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Question> getQuiestions() {
        return quiestions;
    }

    public void setQuiestions(List<Question> quiestions) {
        this.quiestions = quiestions;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }
}
