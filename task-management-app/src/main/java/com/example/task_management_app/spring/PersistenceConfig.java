package com.example.task_management_app.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.task_management_app.persistence.repository.impl.ProjectRepositoryImpl;

@Configuration
public class PersistenceConfig {

    @Bean
    ProjectRepositoryImpl projectRepository() {
        return new ProjectRepositoryImpl();
    }

}
