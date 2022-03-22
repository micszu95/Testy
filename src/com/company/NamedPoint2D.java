package com.company;

public class NamedPoint2D extends Point2D{

    String pointName = "-";

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public NamedPoint2D(String pointName, int x, int y) {
        this.x = x;
        this.y = y;
        this.pointName = pointName;
    }

    @Override
    public String toString() {
        return pointName+" = ("+x+";"+y+")";
    }
}
