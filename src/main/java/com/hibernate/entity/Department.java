package com.hibernate.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "department")

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    Long id;
    @Column
    String departmentname;
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    List<Employee> employeeList = new ArrayList<>();

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    Department() {
    }

    public Department(Long id, String departmentname, List<Employee> employeeList) {
        this.id = id;
        this.departmentname = departmentname;
        this.employeeList = employeeList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }



}
