package com.enigma.java_oop.polymorphism;

public class Block extends Rectangle {
    public Double heigth;
    public Block(Double length, Double width, Double heigth){
        super(length,width);
        this.heigth = heigth;
    }
    public Double getLuas() {
        System.out.println("Test" + super.getLength() + this.getWidth());
        return super.length;
    }
    @Override // <- anotasi: sebuah penanda/metadata
    // Override : menuliskan ulang/ overwrite
    public Double getArea() {
        return 2 * (super.length * super.width) +
                2 * (super.length * this.heigth) +
                2 * (super.width * this.heigth);
    }
}
