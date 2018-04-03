package com.chf.mybatis.controller;


import com.chf.mybatis.entity.User;
import com.chf.mybatis.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author 温柔一刀
 * @create 2018-03-25 11:55
 **/
@Api(value = "用户管理",description="user服务API")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @ApiOperation("查询用户列表")
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<User> getUserList(){
       return userService.getUserList();
     }
    @ApiOperation("查询单个用户")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
     public  User getUser(@PathVariable Long id){
        return userService.get(id);
     }
    @ApiOperation("新增用户")
     @RequestMapping(value = "/",method = RequestMethod.POST)
    public String addUser(@ModelAttribute User user){
        userService.add(user);
        return "success";

    }
    @ApiOperation("修改用户")
    @RequestMapping(value = "/{id}",method = RequestMethod.POST)
    public String updateUser(@PathVariable Long id ,@ModelAttribute User user){
       User  oldUser=userService.get(id);
        oldUser.setAge(user.getAge());
        oldUser.setName(user.getName());
        userService.update(oldUser);
        return "success";
    }
    @ApiOperation("删除用户")
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id){
        userService.delete(id);
        return "success";
    }
}


