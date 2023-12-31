package com.kong.redis;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kong.redis.pojo.User;
import com.kong.redis.utils.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class Demo05RedisApplicationTests {
	@Autowired
	private RedisTemplate redisTemplate;

    @Autowired
    RedisUtil redisUtil;

	@Test
	void contextLoads() {
		RedisConnection connection = redisTemplate.getRequiredConnectionFactory().getConnection();
        System.out.println(connection);
	}
    @Test
    public void test1() {
        redisTemplate.opsForValue().set("name","张三");
        System.out.println(redisTemplate.opsForValue().get("name"));

    }


    @Test
    public void test2(){
        redisUtil.set("user2","lisi");
        System.out.println(redisUtil.get("user2"));
        redisUtil.set("name3","wangwu");
         System.out.println(redisUtil.get("name3"));
    }


    @Test
    public void test3() throws JsonProcessingException {
        User user1 = new User("kongman", 12);
        String jsonUser = new ObjectMapper().writeValueAsString(user1);
        redisTemplate.opsForValue().set("user",jsonUser);
        System.out.println(redisTemplate.opsForValue().get("user"));
    }
    @Test
    public void test4() throws JsonProcessingException {
        User user2 = new User("kongman11", 121);

        redisUtil.set("admin",user2);
        System.out.println(redisUtil.get("admin"));
    }

}
