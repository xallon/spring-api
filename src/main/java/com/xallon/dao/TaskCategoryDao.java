package com.xallon.dao;

import com.xallon.entity.TaskCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(exported = false)
public interface TaskCategoryDao extends JpaRepository<TaskCategory, Integer> {
}