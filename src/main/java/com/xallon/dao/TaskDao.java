package com.xallon.dao;

import com.xallon.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskDao extends JpaRepository<Task, Long> {
}
