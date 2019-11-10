package com.sam.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.sam.quartz.route")
public class QuartzDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(QuartzDemoApplication.class, args);
	}
}
