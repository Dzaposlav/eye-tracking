package com.example.demo.data.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by fdzapo on 27-Feb-19.
 */
@Entity
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @CreationTimestamp
    private LocalDateTime creationTime;
}
