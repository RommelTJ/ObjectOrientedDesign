package com.rommelrico.teachers;

/**
 * Created by Rommel on 5/1/2016.
 */
public class ScienceTeacher extends SchoolStaff implements Instructor {
    @Override
    public void teach() {
        System.out.println("Science teacher teaching");
    }
}
