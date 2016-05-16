package com.rommelrico.subjects;

import com.rommelrico.observers.IObserver;

/**
 * Created by rommelrico on 5/6/16.
 */
public interface ISubject {
    void registerObserver(IObserver o);
    void removeObserver(IObserver o);
    void notifyObservers();
}
