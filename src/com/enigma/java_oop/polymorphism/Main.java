package com.enigma.java_oop.polymorphism;

import com.enigma.java_oop.polymorphism.Block;
import com.enigma.java_oop.polymorphism.Cow;

public class Main {
    public static void main(String[] args) {
//        Block block1 = new Block(10.0,5.0, 2.0);
//        System.out.println(block1.getArea());

        Cow cow = new Cow();
        cow.breathe();
    }
}
