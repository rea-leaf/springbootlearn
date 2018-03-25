package com.chf.springbootrestfulapi.service;

import com.chf.springbootrestfulapi.entity.User;
import jdk.internal.dynalink.beans.StaticClass;
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

    private static ConcurrentHashMap<Long,User> map=new ConcurrentHashMap();

    public List<User> getUserList(){
        return  new ArrayList<User>(map.values());
    }

    public void add(User user) {
        map.put(user.getId(),user);
    }

    public User get(Long id) {
        return  map.get(id);
    }

    public void delete(Long id) {
        map.remove(id);
    }

    public void update(User user) {
        map.put(user.getId(),user);
    }
}
