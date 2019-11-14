package com.xallon.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "category")
public class TaskCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "taskCategory", cascade = CascadeType.ALL)
    private Set<Task> tasks;

    public TaskCategory(){
    }

    public TaskCategory(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        String result = String.format(
                "Category[id=%d, name='%s']%n",
                id, name);
        if (tasks != null) {
            for(Task task : tasks) {
                result += String.format(
                        "Task[id=%d, title='%s']%n",
                        task.getId(), task.getTitle());
            }
        }
        return result;
    }
}