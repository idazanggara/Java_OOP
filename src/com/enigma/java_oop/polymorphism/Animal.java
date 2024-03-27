package com.enigma.java_oop.polymorphism;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void breathe(){
        System.out.println("Animal is breathing");
    }

    public void move() {
        System.out.println("Animal is moving");
    }

    public void makeSound() {
        System.out.println("Animal Sound");
    }
}
