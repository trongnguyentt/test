package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class control {
@RequestMapping ("/high")
    public String hello(){
    return "hello.html";

}
}
