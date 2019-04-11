package com.example.demo.data.repository;

import com.example.demo.data.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by fdzapo on 27-Feb-19.
 */
public interface QuestionRepository extends JpaRepository<Question, Serializable> {
    List<Question> findByQuizId(Long quizId);
}
