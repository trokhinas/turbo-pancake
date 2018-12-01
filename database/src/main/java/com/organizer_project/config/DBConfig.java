package com.organizer_project.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("com.organizer_project.entity")
@EnableJpaRepositories("com.organizer_project.repositories")
@PropertySource("classpath:hibernate.properties")
public class DBConfig {
}
