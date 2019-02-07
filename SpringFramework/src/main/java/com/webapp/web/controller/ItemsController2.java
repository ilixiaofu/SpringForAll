package com.webapp.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

public class ItemsController2 implements HttpRequestHandler {

    @Override
    public void handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
        System.out.println("HttpRequestHandler");
    }

}
