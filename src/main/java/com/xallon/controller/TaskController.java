package com.xallon.controller;

import com.xallon.entity.TaskCategory;
import com.xallon.service.TaskService;
import com.xallon.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("api/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<TaskCategory> list() {
        return taskService.findAll();
    }

    @PostMapping
    public Task create(Task task){
        return taskService.createTask(task);
    }

    @PutMapping
    public Task update(Task task){
        return  taskService.updateTask(task);
    }

    @DeleteMapping
    public void delete(Long id){
        taskService.deleteTask(id);
    }

}