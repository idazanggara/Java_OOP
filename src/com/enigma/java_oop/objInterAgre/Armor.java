package com.enigma.java_oop.objInterAgre;

public class Armor {
    public String name;
    public Double defencePower;

    public Armor(String name, Double defencePower) {
        this.name = name;
        this.defencePower = defencePower;
    }

    public void display() {
        System.out.println("Armor : " + this.name + " , Defence : " + this.defencePower);
    }
}
