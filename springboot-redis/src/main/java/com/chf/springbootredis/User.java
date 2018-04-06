package com.chf.springbootredis;

import lombok.Data;

import java.io.Serializable;

/**
 * ${DESCRIPTION}
 *
 * @author 温柔一刀
 * @create 2018-04-05 18:59
 **/
@Data
public class User implements Serializable{
    private  long id;
    private  String name;
    private  int age;
}
