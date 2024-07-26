package com.example.task_management_app.persistence.repository;

import java.util.Optional;

import com.example.task_management_app.persistence.model.Project;

public interface IProjectRepository {

    Optional<Project> findById(Long id);

    Project save(Project project);
}
