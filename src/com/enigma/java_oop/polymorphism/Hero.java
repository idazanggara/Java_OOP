package com.enigma.java_oop.polymorphism;

public class Hero {
    public String name;
//    public Hero(String name) {
//        this.name = name;
//    }
    public void display() {
        System.out.println("\nName : " + this.name);
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                '}';
    }
}
