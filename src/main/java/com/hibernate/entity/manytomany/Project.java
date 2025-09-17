package com.hibernate.entity.manytomany;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Project {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    String projectName;

    @ManyToMany(mappedBy = "projects")
    Set<ProjectEmployee> employees = new HashSet<>();

    public Project(Set<ProjectEmployee> employees) {
        this.employees = employees;
    }

    public Project(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Set<ProjectEmployee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<ProjectEmployee> employees) {
        this.employees = employees;
    }
}
