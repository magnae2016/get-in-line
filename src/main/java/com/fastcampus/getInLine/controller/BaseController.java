package com.fastcampus.getInLine.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BaseController implements ErrorController {
    @GetMapping("/")
    public String root() {
        return "index";
    }

    @RequestMapping("/myError")
    public String myerror() {
        return "error";
    }
}
