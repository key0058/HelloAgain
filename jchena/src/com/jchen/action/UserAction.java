package com.jchen.action;

import com.jchen.bean.User;
import com.jchen.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller(value = "userAction")
@Scope("prototype")
@ParentPackage("struts-default")
public class UserAction extends ActionSupport {

    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    @Resource(name = "userService")
    private UserService userService;

    @Action(value = "login", results = {@Result(name = "success", location = "/user.jsp"), @Result(name = "error", location = "/error.jsp")})
    public String login() {
        try {
            System.out.print("+++++" + user.getUsername());
            if (userService.loginUser(user.getUsername(), user.getPassword())) {
                return SUCCESS;
            }
            return ERROR;
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }

    }

}
