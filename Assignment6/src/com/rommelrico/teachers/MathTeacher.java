package com.rommelrico.teachers;

/**
 * Created by Rommel on 5/1/2016.
 */
public class MathTeacher extends SchoolStaff implements Instructor {
    @Override
    public void teach() {
        System.out.println("Math teacher teaching");
    }
}
