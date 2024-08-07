package com.example.task_management_app.persistence.model;

import java.time.LocalDate;
import java.util.Objects;

public class Project {

    private Long id;
    private String name;
    private LocalDate dateCreated;

    public Project(Long id, String name, LocalDate dateCreated) {
        super();
        this.id = id;
        this.name = name;
        this.dateCreated = dateCreated;
    }

    public Project(Project project) {
        this(project.getId(), project.getName(), project.getDateCreated());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Project [id=" + id + ", name=" + name + ", dateCreated=" + dateCreated + "]";
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateCreated, id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Project other = (Project) obj;
        return Objects.equals(dateCreated, other.dateCreated) && Objects.equals(id, other.id) && Objects.equals(name, other.name);
    }

}
