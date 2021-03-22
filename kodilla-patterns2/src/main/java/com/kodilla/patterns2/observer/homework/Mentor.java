package com.kodilla.patterns2.observer.homework;

public class Mentor implements HomeworkObserver{
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(Homework homework) {
        System.out.println(name + "Student has sent homework \"" +
                homework.getName() + "\" to check. Total homeworks to check: " + homework.getHomeworks().size());
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}