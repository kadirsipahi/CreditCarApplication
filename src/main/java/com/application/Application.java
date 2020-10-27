package com.application;

import com.application.service.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan("com.application.model")
@ComponentScan(basePackages = { "com.application.*" })
@EnableAutoConfiguration
@SpringBootApplication
public class Application {

    @Autowired
    private static AdminServiceImpl adminService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
