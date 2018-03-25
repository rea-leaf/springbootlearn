package com.chf.springbootconfig;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * ${DESCRIPTION}
 *
 * @author 温柔一刀
 * @create 2018-03-22 21:15
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ConfigPropertiesTest {
    @Autowired
    ConfigProperties configProperties;
    @Test
    public void test(){

        System.out.println(configProperties.toString());
    }

}
