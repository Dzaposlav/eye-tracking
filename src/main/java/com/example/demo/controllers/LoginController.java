package com.example.demo.controllers;

import com.example.demo.data.model.Role;
import com.example.demo.data.model.User;
import com.example.demo.data.repository.RoleRepository;
import com.example.demo.service.security.UserService;
import com.example.demo.service.security.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by fdzapo on 07-Mar-19.
 */
@Controller
public class LoginController {
    private static final String REGISTER_PAGE = "registration";
    private static final String LOGIN_PAGE = "login";

    @Autowired
    private UserService userService;

    @Autowired
    private UserValidator userValidator;

    @Autowired
    RoleRepository roleRepository;

    @GetMapping
    public ModelAndView getLogin() {
        return new ModelAndView(LOGIN_PAGE);
    }


    @GetMapping("/registration")
    public ModelAndView registration(ModelMap modelMap){
        modelMap.addAttribute("user", new User());

        return new ModelAndView(REGISTER_PAGE, modelMap);
    }

    @PostMapping("registration")
    public ModelAndView createNewUser(User user, ModelMap modelMap, Errors errors) {

        userValidator.validate(user, errors);
        if (errors.hasErrors()) {
            return new ModelAndView(REGISTER_PAGE, modelMap);
        }

        userService.save(user);

        return new ModelAndView("index", modelMap);
    }

//    @RequestMapping(value="/admin/home", method = RequestMethod.GET)
//    public ModelAndView home(){
//        ModelAndView modelAndView = new ModelAndView();
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        User user = userService.findUserByEmail(auth.getName());
//        modelAndView.addObject("userName", "Welcome " + user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
//        modelAndView.addObject("adminMessage","Content Available Only for Users with Admin Role");
//        modelAndView.setViewName("admin/home");
//        return modelAndView;
//    }


}