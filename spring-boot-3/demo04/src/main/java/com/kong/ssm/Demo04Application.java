package com.kong.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com/kong/ssm/mapper")
@SpringBootApplication
public class Demo04Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo04Application.class, args);
	}

}
