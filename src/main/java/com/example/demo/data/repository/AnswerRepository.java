package com.example.demo.data.repository;

import com.example.demo.data.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by fdzapo on 27-Feb-19.
 */
public interface AnswerRepository extends JpaRepository<Answer, Serializable> {
    List<Answer> findByQuestionId(Long questionId);
}
