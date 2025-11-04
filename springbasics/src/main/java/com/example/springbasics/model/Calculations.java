package com.example.springbasics.model;

public class Calculations {
    private final int add;
    private final int sub;
    private final int mul;
    private final float div;

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
