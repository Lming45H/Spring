package com.lushannanlu.controller;

import com.lushannanlu.pojo.User;
import com.lushannanlu.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/h1")
public class HelloServlet {
    @Autowired
    private UserServiceImp userServiceImp;
    @RequestMapping("/t1")
    public String getUser(Model model){
        List<User> users = userServiceImp.queryUser();
        model.addAttribute("users",users);
        return "hello";
    }
}
