package com.example.demo.controllers;

import com.example.demo.data.model.Quiz;
import com.example.demo.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by fdzapo on 26-Feb-19.
 */
@Controller
public class MainController {

    @Autowired
    private QuizService quizService;

    @GetMapping("/")
    public ModelAndView index(ModelMap modelMap){
        List<Quiz> quizzes = quizService.findAll();

        modelMap.addAttribute("quizzes", quizzes);
        modelMap.addAttribute("id", 3);
        return new ModelAndView("index");
    }


}
