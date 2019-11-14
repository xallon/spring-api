package com.xallon.service;

import com.xallon.dao.TaskCategoryDao;
import com.xallon.dao.TaskDao;
import com.xallon.entity.Task;
import com.xallon.entity.TaskCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.security.InvalidParameterException;
import java.util.List;

@Service
public class TaskService {
    private TaskDao taskDao;
    private TaskCategoryDao taskCategoryDao;

    @Autowired
    public  TaskService(TaskDao taskDao, TaskCategoryDao taskCategoryDao){
        this.taskDao = taskDao;
        this.taskCategoryDao = taskCategoryDao;
    }

    public List<TaskCategory> findAll(){
        return taskCategoryDao.findAll();
    }

    public Task createTask(Task task){
        return taskDao.save(task);
    }

    public Task updateTask(Task task){
        if (taskDao.exists(task.getId())){
            return taskDao.save(task);
        }
        throw new InvalidParameterException();
    }

    public void deleteTask(Long id){
        if (taskDao.exists(id)){
            taskDao.delete(id);
        }
    }
}
