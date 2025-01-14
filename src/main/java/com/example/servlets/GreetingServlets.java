package com.example.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;

@WebServlet("/greet")

public class GreetingServlets extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getParameter("name");
        resp.setContentType("text/html");
        if (req.getParameter("name") == null) {
            resp.getWriter().println("Hello, guest!");
        } else {
            resp.getWriter().println("Hello " + req.getParameter("name"));
        }
    }
}

