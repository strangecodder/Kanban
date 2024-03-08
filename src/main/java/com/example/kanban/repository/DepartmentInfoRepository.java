package com.example.kanban.repository;

import com.example.kanban.entity.DepartmentInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentInfoRepository extends CrudRepository<DepartmentInfo,Integer> {
}
