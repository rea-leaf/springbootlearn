package com.chf.springbootconfig;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * ${DESCRIPTION}
 *
 * @author 温柔一刀
 * @create 2018-03-24 10:32
 **/
@Component
@Data
public class ConfigProperties {
    @Value("${com.chf.config.name}")
    private String name;
    @Value("${com.chf.config.age}")
    private Integer age;

}
