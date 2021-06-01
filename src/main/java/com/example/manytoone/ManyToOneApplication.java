package com.example.manytoone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages = "com.example.manytoone.repository")
@SpringBootApplication
public class ManyToOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManyToOneApplication.class, args);
    }

}
