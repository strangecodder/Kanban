package com.example.kanban.repository;

import com.example.kanban.entity.Task;
import com.example.kanban.entity.TitlesInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitlesInfoRepository extends CrudRepository<TitlesInfo,Integer> {
}
