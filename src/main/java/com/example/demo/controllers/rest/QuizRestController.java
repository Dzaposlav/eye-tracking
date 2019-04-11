package com.example.demo.controllers.rest;

import com.example.demo.data.model.Quiz;
import com.example.demo.data.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fdzapo on 11-Mar-19.
 */
@RestController
public class QuizRestController {

    @Autowired
    QuizRepository quizRepository;

    @GetMapping("quizrest/{id}")
    public Quiz getQuizData(@PathVariable (value="id") Long id){
        Quiz responce = quizRepository.findById(id);
        return responce;
    }


}
