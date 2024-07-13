package com.example.service;

import java.util.Optional;

import com.example.persistence.model.Project;

public interface IProjectService {

    Optional<Project> findById(Long id);

    Project save(Project project);
}
