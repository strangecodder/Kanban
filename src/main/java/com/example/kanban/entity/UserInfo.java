package com.example.kanban.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;

@Entity
public class UserInfo {

    @Id
    @Getter
    private  int id;

    @Getter
    private String first_name;

    @Getter
    private String second_name;

    @Getter
    @OneToOne
    private TitlesInfo job_title;

    @Getter
    @OneToOne
    private DepartmentInfo department;

    public UserInfo(){}

    public  UserInfo(String first_name, String second_name, TitlesInfo job_title,
                     DepartmentInfo department){
        this.first_name = first_name;
        this.second_name = second_name;
        this.job_title = job_title;
        this.department = department;
    }
}
