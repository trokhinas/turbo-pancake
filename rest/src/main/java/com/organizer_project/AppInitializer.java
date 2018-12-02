package com.organizer_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : sasha
 */

@SpringBootApplication(scanBasePackages = "com.organizer_project")
public class AppInitializer {

    public static void main(String[] args) {
        SpringApplication.run(AppInitializer.class);
    }

}
