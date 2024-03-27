package com.enigma.java_oop.polymorphism;

public class Cow extends Animal {
    public void makeSound() {
        System.out.println("Moooooo");
    }

    @Override
    public void breathe() {
        System.out.println("Cow is breathing");
    }
}
