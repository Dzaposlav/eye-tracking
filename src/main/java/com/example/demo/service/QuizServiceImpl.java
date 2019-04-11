package com.example.demo.service;

import com.example.demo.data.model.Quiz;
import com.example.demo.data.repository.QuizRepository;
import com.example.demo.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fdzapo on 10-Mar-19.
 */
@Service
public class QuizServiceImpl implements QuizService {

    @Autowired
    QuizRepository quizRepository;

    @Override
    public Quiz findQuizById(long id){
        return quizRepository.findById(id);
    }

    @Override
    public void saveQuiz(Quiz quiz){
        quizRepository.save(quiz);
        return;
    }

    @Override
    public List<Quiz> findAll(){return quizRepository.findAll();}
}
