package com.jxufe.job;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.jxufe.*"})
@MapperScan(basePackages={ "com.jxufe.**.mapper"})
@SpringBootApplication
public class StudentJobApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentJobApplication.class, args);
		
	}

}
