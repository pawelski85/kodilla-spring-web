package com.kodilla.patterns2.observer.homework;

public interface HomeworkObservable {
    void registerObserver(HomeworkObserver observer);
    void notifyObservers();
    void removeObserver(HomeworkObserver observer);
}