package com.chf.mybatis.controller.dao;

import com.chf.mybatis.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author 温柔一刀
 * @create 2018-04-03 23:38
 **/
@Mapper
public interface  UserDao {
    @Select("SELECT * FROM USER ")
    public List<User> getUserList();
    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
    public void add(User user);
    @Select("SELECT * FROM USER  where id=#{id}")
    public User get(Long id);
    @Delete("delete  FROM USER  where id=#{id}")
    public void delete(Long id);
    @Update("update  USER set name=#{name},age=#{age}  where id=#{id}")
    public void update(User user);
}
