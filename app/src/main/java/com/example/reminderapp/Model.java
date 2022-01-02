package com.example.reminderapp;

public class Model {
    int id;
    String title, date, time;

//    public Model() {
//    }

    public Model(int id,String title, String date, String time) {
        this.title = title;
        this.date = date;
        this.time = time;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

