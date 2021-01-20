package com.kodilla.hibernate.tasklist;

import com.kodilla.hibernate.task.Task;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="TASKLISTS")
public final class TaskList {
    private int id;
    private String listName;
    private String description;
    private List<Task> tasks= new ArrayList<>();

    public TaskList(){

    }

    public TaskList(String listName, String description){
        this.listName=listName;
        this.description=description;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    @Column(name = "LISTNAME")
    public String getListName(){ return listName;}

    private void setListName(String listName){this.listName=listName;}

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return listName;
    }

    @OneToMany(
            targetEntity = Task.class,
            mappedBy = "taskList",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Task> getTasks() {
        return tasks;
    }

    private void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
