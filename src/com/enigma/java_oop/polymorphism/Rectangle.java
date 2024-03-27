package com.enigma.java_oop.polymorphism;

public class Rectangle {
    protected Double length;
    protected Double width;

    public Rectangle(Double length,Double width) {
        this.length = length;
        this.width = width;
    }
    // urutan parameter contructor satu dengan lainnya bisa berbeda, tapi ingat yg berbeda itu urutan tipe data parameternya
    public Rectangle() {

    }

    public Double getArea() {
        return this.length * this.width;
    }

    public Double getArea(String message) {
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
