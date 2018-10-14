package com.unicom.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.unicom"})
@MapperScan("com.unicom.mapper")

public class SpringApp{
	
	public static void main(String[] args) {
		SpringApplication.run(SpringApp.class, args);
	}
	
	
}