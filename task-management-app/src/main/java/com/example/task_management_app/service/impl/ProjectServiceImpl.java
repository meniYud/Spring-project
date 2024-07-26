package com.example.task_management_app.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.task_management_app.persistence.model.Project;
import com.example.task_management_app.persistence.repository.IProjectRepository;
import com.example.task_management_app.service.IProjectService;

public class ProjectServiceImpl implements IProjectService {

    @Autowired
    private IProjectRepository projectRepo;

    @Override
    public Optional<Project> findById(Long id) {
        // TODO Auto-generated method stub
        return projectRepo.findById(id);
    }

    @Override
    public Project save(Project project) {
        // TODO Auto-generated method stub
        return projectRepo.save(project);
    }

}
