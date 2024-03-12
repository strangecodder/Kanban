package com.example.kanban.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

import java.util.Date;
import java.util.Set;

@Entity
public class Task {

    @Id
    private int id;

    @Getter
    @ManyToOne
    @JoinColumn(name = "person_id",referencedColumnName = "id")
    private UserInfo person_id;

    @Getter
    private String description;

    @Getter
    private Date deadline;

    @Getter
    private Date finish_date;

    public Task(){}

    public Task(UserInfo person_id, String description, Date deadline, Date finish_date){
        this.person_id = person_id;
        this.description = description;
        this.deadline = deadline;
        this.finish_date = finish_date;
    }
}
