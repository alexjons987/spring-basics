package com.example.springbasics.model;

public class Calculations {
    private int add;
    private int sub;
    private int mul;
    private float div;

    public Calculations(int x, int y) {
        this.add = x + y;
        this.sub = x - y;
        this.mul = x * y;
        this.div = (float) x / (float) y;
    }

    public int getAdd() {
        return this.add;
    }

    public int getSub() {
        return this.sub;
    }

    public int getMul() {
        return this.mul;
    }

    public float getDiv() {
        return this.div;
    }
}
