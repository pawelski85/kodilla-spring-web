package com.kodilla.patterns.factory.tasks;

public interface Task {
    String getTaskName();
    String executeTask();
    boolean isTaskExecuted();
}
