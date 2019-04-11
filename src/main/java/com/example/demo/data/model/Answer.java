package com.example.demo.data.model;

import javax.persistence.*;

/**
 * Created by fdzapo on 27-Feb-19.
 */
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String text;

    private boolean correct;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
}
