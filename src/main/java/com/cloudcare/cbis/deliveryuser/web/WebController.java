package com.cloudcare.cbis.deliveryuser.web;

import com.cloudcare.cbis.deliveryuser.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WebController {

    @RequestMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setAge(11);
        user.setName("小明");
        user.setPass("111");

        return user;
    }

    @RequestMapping(name="/getUserList")
    public List<User> getUserList(){
        List<User> users= new ArrayList<>();
        User user1=new User();
        user1.setName("neo111");
        user1.setAge(30);
        user1.setPass("neo123");
        users.add(user1);
        User user2=new User();
        user2.setName("小明");
        user2.setAge(12);
        user2.setPass("123456");
        users.add(user2);
        return users;
    }
}
