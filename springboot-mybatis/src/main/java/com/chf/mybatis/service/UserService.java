package com.chf.mybatis.service;

import com.chf.mybatis.controller.dao.UserDao;
import com.chf.mybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ${DESCRIPTION}
 *
 * @author 温柔一刀
 * @create 2018-03-25 11:54
 **/
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> getUserList(){
        return  userDao.getUserList();
    }

    public void add(User user) {
        userDao.add(user);
    }

    public User get(Long id) {
        return userDao.get(id);
    }

    public void delete(Long id) {
        userDao.delete(id);
    }

    public void update(User user) {
        userDao.update(user);
    }
}
