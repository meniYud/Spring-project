package com.example.persistence.repository;

import java.util.Optional;

import com.example.persistence.model.Project;

public interface IProjectRepository {

    Optional<Project> findById(Long id);

    Project save(Project project);
}
