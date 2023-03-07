package com.xyq.fan;

public class Singer {
    private int id;
    private String name;
    private double salary;
    private String song;

    public Singer(int id, String name, double salary, String song) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.song = song;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}