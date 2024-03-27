package com.enigma.java_oop.inheritance;

public class Rectangle {
    public Double length;
    private Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }


    public Double getArea() {
        return this.length * this.width;
    }

    public Double getCircumference(){
        return 2 * (this.length + this.width);
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
}
