package com.chf.springbootrestfulapi.controller;

import com.chf.springbootrestfulapi.entity.User;
import com.chf.springbootrestfulapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author 温柔一刀
 * @create 2018-03-25 11:55
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<User> getUserList(){
       return userService.getUserList();
     }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
     public  User getUser(@PathVariable Long id){
        return userService.get(id);
     }
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String addUser(@ModelAttribute User user){
        userService.add(user);
        return "success";

    }

    @RequestMapping(value = "/{id}",method = RequestMethod.POST)
    public String updateUser(@PathVariable Long id ,@ModelAttribute("user") User user){
       User  oldUser=userService.get(id);
        oldUser.setAge(user.getAge());
        oldUser.setName(user.getName());
        userService.update(oldUser);
        return "success";
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id){
        userService.delete(id);
        return "success";
    }
}


