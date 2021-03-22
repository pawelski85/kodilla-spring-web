package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Homework implements HomeworkObservable {
    private final String name;
    private final List<String> homeworks;
    private final List<HomeworkObserver> observers;

    public Homework(String name) {
        observers = new ArrayList<>();
        homeworks = new ArrayList<>();
        this.name = name;
    }

    public void addHomework(String homework) {
        homeworks.add(homework);
        notifyObservers();
    }

    public String getName() {
        return name;
    }

    public List<String> getHomeworks() {
        return homeworks;
    }

    @Override
    public void registerObserver(HomeworkObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (HomeworkObserver observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(HomeworkObserver observer) {
        observers.remove(observer);
    }
}