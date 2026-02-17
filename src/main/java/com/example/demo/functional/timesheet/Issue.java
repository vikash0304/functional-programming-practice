package com.example.demo.functional.timesheet;

import java.util.List;

public class Issue {

    int id;
    String title;
    List<Worklog> workLogs;

    public Issue(int id, String title, List<Worklog> workLogs) {
        this.id = id;
        this.title = title;
        this.workLogs = workLogs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Worklog> getWorkLogs() {
        return workLogs;
    }

    public void setWorkLogs(List<Worklog> workLogs) {
        this.workLogs = workLogs;
    }
}
