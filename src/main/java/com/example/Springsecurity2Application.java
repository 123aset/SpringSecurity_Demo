package com.example;

import com.example.model.Role;
import com.example.repository.RoleRepository;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springsecurity2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springsecurity2Application.class, args);
    }
}
