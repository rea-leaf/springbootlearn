package com.chf.springbootredis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {

	@Autowired
	private RedisTemplate redisTemplate;

	@Test
	public void set(){
		User user= new User();
		user.setAge(10);
		user.setId(1);
		user.setName("tom");
		redisTemplate.opsForValue().set("test",user.toString());
		Object oo=redisTemplate.opsForValue().get("test");

		System.out.println("-------："+oo.toString());
	}

}
