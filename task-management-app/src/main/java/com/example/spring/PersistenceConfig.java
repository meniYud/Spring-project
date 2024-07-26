package com.example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.persistence.repository.impl.ProjectRepositoryImpl;

@Configuration
public class PersistenceConfig {

    @Bean
    ProjectRepositoryImpl projectRepository() {
        return new ProjectRepositoryImpl();
    }

}
