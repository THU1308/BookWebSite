package com.group7.bookshopwebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExController {

    @GetMapping("not_found")
    String notFound(){
        return "admin/404";
    }
}
