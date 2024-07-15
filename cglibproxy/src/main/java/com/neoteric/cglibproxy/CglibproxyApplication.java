package com.neoteric.cglibproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class CglibproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CglibproxyApplication.class, args);
	}
}
