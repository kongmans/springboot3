package com.kong.redis;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kong.redis.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class Demo05RedisApplicationTests {
	@Autowired
	private RedisTemplate redisTemplate;
	@Test
	void contextLoads() {
//		RedisConnection connection = redisTemplate.getRequiredConnectionFactory().getConnection();
//		connection.flushDb();

		redisTemplate.opsForValue().set("name","张三");
		System.out.println(redisTemplate.opsForValue().get("name"));

	}

    @Test
    public void test() throws JsonProcessingException {
        User user1 = new User("kongman", 12);
        String jsonUser = new ObjectMapper().writeValueAsString(user1);
        redisTemplate.opsForValue().set("user",jsonUser);
        System.out.println(redisTemplate.opsForValue().get("user"));
    }

}
