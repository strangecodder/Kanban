package com.example.kanban.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
public class DepartmentInfo {

    @Id
    private int id;

    @Getter
    private int workersQuantity;

    @Getter
    private int departmentBoss;

    @Getter
    private String address;

    public DepartmentInfo(){};

    public DepartmentInfo(int workersQuantity, int departmentBoss, String address){
        this.workersQuantity = workersQuantity;
        this.departmentBoss = departmentBoss;
        this.address = address;
    }

}
