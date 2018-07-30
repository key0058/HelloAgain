package com.jchen.main;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;


@WebServlet(name="helloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charSet=UTF8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println("+++++++TEST+++++++");
        System.out.println("+++++++" + username + "+++++++");
        System.out.println("+++++++" + password + "+++++++");
        PrintStream out = new PrintStream(resp.getOutputStream());
        out.println("<h1>Hello again servlet!");
    }
}
