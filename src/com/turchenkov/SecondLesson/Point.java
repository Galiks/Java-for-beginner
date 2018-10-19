package com.turchenkov.SecondLesson;

public class Point {
    public int x, y, useC;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public final static Point origin = new Point(0,0);
}
