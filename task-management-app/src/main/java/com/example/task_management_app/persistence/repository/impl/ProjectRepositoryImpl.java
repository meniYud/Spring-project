package com.example.task_management_app.persistence.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.example.task_management_app.persistence.model.Project;
import com.example.task_management_app.persistence.repository.IProjectRepository;

@Component
public class ProjectRepositoryImpl implements IProjectRepository {

    private List<Project> projects = new ArrayList<>();

    public ProjectRepositoryImpl() {
        super();
    }

    @Override
    public Optional<Project> findById(Long id) {
        return projects.stream()
            .filter(p -> p.getId() == id)
            .findFirst();
    }

    @Override
    public Project save(Project project) {
        Project existingProject = findById(project.getId()).orElse(null);

        if (existingProject == null) {
            projects.add(project);
        } else {
            projects.remove(existingProject);
            Project newProject = new Project(project);
            projects.add(newProject);
        }
        return project;
    }

}
