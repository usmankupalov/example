package com.example.example2;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ComponentScan("com.example.example2")
public class AppConfig {

    @Bean
    public UserService userService(UserRepository userRepository) {
        return new UserServiceIml(userRepository);
    }
}
