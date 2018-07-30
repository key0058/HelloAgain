package com.jchen.main;

import com.jchen.service.HelloService;
import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {

    private HelloService helloService;
    private HelloService helloAgainService;
    private Person person;

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    public void setHelloAgainService(HelloService helloAgainService) {
        this.helloAgainService = helloAgainService;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public String hello() throws Exception {
        System.out.println("+++ Call hello");
        if (helloAgainService.checkUser(getPerson().getUsername(), getPerson().getPassword()))
            return SUCCESS;
        return ERROR;
    }

    public String login() throws Exception {
        System.out.println("+++ Call login");
        if (helloService.checkUser(getPerson().getUsername(), getPerson().getPassword())) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

}
