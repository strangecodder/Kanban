package com.example.kanban.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
public class TitlesInfo {

    @Id
    @Getter
    private int id;

    @Getter
    private String title_name;

    public TitlesInfo(){}

    public TitlesInfo(String title_name){
        this.title_name = title_name;
    }
}
