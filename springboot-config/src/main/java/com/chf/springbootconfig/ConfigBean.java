package com.chf.springbootconfig;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * ${DESCRIPTION}
 *
 * @author 温柔一刀
 * @create 2018-03-22 21:46
 **/
@Configuration
@PropertySource("classpath:config/config.properties")
@ConfigurationProperties(prefix = "com.chf.config")
@Data
public class ConfigBean {
    private  String id;
    private  String name;
    private  String desc;
    private Integer age;

}
