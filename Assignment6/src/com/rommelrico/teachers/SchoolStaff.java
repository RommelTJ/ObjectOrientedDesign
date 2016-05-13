package com.rommelrico.teachers;

/**
 * Created by Rommel on 5/1/2016.
 */
public class SchoolStaff {
    private String name;

    public void performOtherResponsibilities() {
        makeAnnouncements();
        takeAttendance();
        collectPaperWork();
        conductHallwayDuties();
    }

    private void conductHallwayDuties() {
        System.out.println("Conducting Hallway Duties");
    }

    private void collectPaperWork() {
        System.out.println("Collecting Paperwork");
    }

    private void takeAttendance() {
        System.out.println("Taking Attendance");
    }

    private void makeAnnouncements() {
        System.out.println("Making Announcements");
    }
}
