package com.tina.task;

import java.util.ArrayList;

public class TaskList {
    private final ArrayList<Task> taskList = new ArrayList<>();
    public ArrayList<Task> getTaskList() {
        return taskList;
    }

    public void add(Task task) {
        taskList.add(task);
    }

    public void remove(Task task) {
        taskList.remove(task);
    }

    public int size() {
        return taskList.size();
    }
}
