package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @RequestMapping("/666.jpg")
//    public String hello(){
//        return "666";
//    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getUser(){
        return "GET-User";
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String saveUser(){
        return "POST-User";
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public String putUser(){
        return "PUT-User";
    }

    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String deleteUser(){
        return "DELETE-User";
    }
}
