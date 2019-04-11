package com.example.demo.controllers;

import com.example.demo.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by fdzapo on 05-Mar-19.
 */
@Controller
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    QuizService quizService;

//    @GetMapping("/{id}")
//    public ModelAndView getQuiz(@PathVariable (value="id") Long quizId, ModelMap modelMap){
//
//    }


}
