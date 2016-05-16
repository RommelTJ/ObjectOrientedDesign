package com.rommelrico.observers;

import com.rommelrico.domain.Employee;

/**
 * Created by rommelrico on 5/6/16.
 */
public interface IObserver {
    void callMe(String msg, Employee employee);
}
