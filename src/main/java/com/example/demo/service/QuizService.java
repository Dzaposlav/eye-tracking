package com.example.demo.service;

import com.example.demo.data.model.Quiz;

import java.util.List;

/**
 * Created by fdzapo on 10-Mar-19.
 */
public interface QuizService {
    Quiz findQuizById(long id);

    void saveQuiz(Quiz quiz);

    public List<Quiz> findAll();
}
