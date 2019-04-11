package com.example.demo.data.repository;

import com.example.demo.data.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

/**
 * Created by fdzapo on 27-Feb-19.
 */
public interface QuizRepository extends JpaRepository<Quiz, Serializable> {

    public Quiz findById(Long id);
}
