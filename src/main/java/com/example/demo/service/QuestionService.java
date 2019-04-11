package com.example.demo.service;

import com.example.demo.data.model.Question;

import java.util.List;

/**
 * Created by fdzapo on 10-Mar-19.
 */
public interface QuestionService {

    public List<Question> findByQuizId(Long quizid);

}
