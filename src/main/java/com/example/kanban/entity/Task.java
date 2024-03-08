package com.example.kanban.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

import java.util.Date;

@Entity
public class Task {

    @Id
    private int id;

    @Getter
    private int person_id;

    @Getter
    private String description;

    @Getter
    private Date deadline;

    @Getter
    private Date finish_date;

    public Task(){}

    public Task(int person_id, String description, Date deadline, Date finish_date){
        this.person_id = person_id;
        this.description = description;
        this.deadline = deadline;
        this.finish_date = finish_date;
    }
}
