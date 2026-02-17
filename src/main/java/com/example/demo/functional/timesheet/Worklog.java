package com.example.demo.functional.timesheet;

public class Worklog {

    String userName;
    long epochCreated;// milliseconds
    int minutesWorked;

    public Worklog(String userName, long epochCreated, int minutesWorked) {
        this.userName = userName;
        this.epochCreated = epochCreated;
        this.minutesWorked = minutesWorked;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getEpochCreated() {
        return epochCreated;
    }

    public void setEpochCreated(long epochCreated) {
        this.epochCreated = epochCreated;
    }

    public int getMinutesWorked() {
        return minutesWorked;
    }

    public void setMinutesWorked(int minutesWorked) {
        this.minutesWorked = minutesWorked;
    }
}
