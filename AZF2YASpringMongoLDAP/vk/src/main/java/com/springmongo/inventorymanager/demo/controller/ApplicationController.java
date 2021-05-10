package com.springmongo.inventorymanager.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class ApplicationController {
    @GetMapping("/")
    public String HomeMap()
    {
        return "Inventory Management System Home";
    }
    @GetMapping("/secure")
    public String secureMethod() {
        return "secure rest endpoint";
    }
//    @GetMapping("/error")
//    public String error()
//    {
//        return "Error";
//    }

}
