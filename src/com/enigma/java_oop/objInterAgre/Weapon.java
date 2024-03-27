package com.enigma.java_oop.objInterAgre;

public class Weapon {
    public String name;
    public Double attackPower;

    public Weapon(String name, Double attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    public void display() {
        System.out.println("Weapon : " + this.name + " , Attack : " + this.attackPower);
    }
}
