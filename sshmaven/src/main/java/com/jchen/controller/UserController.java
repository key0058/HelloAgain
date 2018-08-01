package com.jchen.controller;

import com.jchen.bean.User;
import com.jchen.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping(value = "/login")
    public String login(User user, Model model) {
        System.out.println("+++++" + user.getUsername() + "-" + user.getPassword());
        if (userService.loginUser(user.getUsername(), user.getPassword())) {
            model.addAttribute("user", user);
            return "user";
        } else {
            return "error";
        }
    }

    @RequestMapping(value = "/check")
    public String check(User user, Model model) {
        System.out.println("+++++" + user.getUsername() + "-" + user.getPassword());
        if (userService.checkUser(user.getUsername(), user.getPassword())) {
            model.addAttribute("user", user);
            return "user";
        } else {
            return "error";
        }
    }
}
