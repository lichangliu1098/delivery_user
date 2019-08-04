package com.cloudcare.cbis.deliveryuser.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/helloworld")
    public String hello(String name,String value){
        return "hello world"+name+value;
    }
}
