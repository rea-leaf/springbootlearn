package com.chf.springsessioncache;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ${DESCRIPTION}
 *
 * @author 温柔一刀
 * @create 2018-04-06 17:26
 **/
@Api(value = "api springsessioncache",description = "api springsessioncache 测试")
@RestController
@RequestMapping("/api")
public class TestController {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ApiOperation("test session")
    public  String test(HttpServletRequest request, HttpServletResponse response){
        String seeionid=request.getSession().getId();
        return "seeionid:"+seeionid;
    }
}
