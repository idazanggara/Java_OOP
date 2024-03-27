package com.enigma.java_oop.inheritance;

 public class Block extends Rectangle{
    public Double heigth = 2.0;
    public Block(Double length, Double width, Double heigth){

        super(length,width);
        // super adalah fungsi khusus untuk pewarisan yg digunakan untuk mengakses contructor, method ataupun attribute/property dari parent/super class
//        this.length = length;
//        this.width = width;
        this.heigth = heigth;
    }

    public Double getLuas() {
        System.out.println("Test" + super.getLength() + this.getWidth());
        return super.length;
    }
}
