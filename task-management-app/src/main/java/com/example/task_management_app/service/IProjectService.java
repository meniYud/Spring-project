package com.example.task_management_app.service;

import java.util.Optional;

import com.example.task_management_app.persistence.model.Project;

public interface IProjectService {

    Optional<Project> findById(Long id);

    Project save(Project project);
}
