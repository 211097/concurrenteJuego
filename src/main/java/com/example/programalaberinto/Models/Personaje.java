package com.example.programalaberinto.Models;

public class Personaje {

    public Personaje(int id, int x, int y) {
        this.id = id;
        X = x;
        Y = y;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    private int id;
    private int X;
    private int Y;


}
