package com.example.demo;

public class IPL {

    private int id;
    private String name;
    private int win;

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

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }


    @Override
    public String toString() {
        return "IPL{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", win=" + win +
                '}';
    }
}
