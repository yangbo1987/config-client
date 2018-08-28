package com.gkyt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value={"classpath:/bootstrap.properties"})
public class MyAppApplication {
	public static void main(String[] args) {
	    ConfigurableApplicationContext context=SpringApplication.run(MyAppApplication.class, args);
		System.out.println("client启动成功");
	}
	
}
