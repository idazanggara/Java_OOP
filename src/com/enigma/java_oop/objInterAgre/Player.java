package com.enigma.java_oop.objInterAgre;

public class Player {
    public String name;
    public Double health;
    public Integer level;
    // agregation
    public Weapon weapon; // sudah berisikan object
    public Armor armor; // sudah berisikan object

    public Player(String name, Double health) {
        this.name = name;
        this.health = health;
    }

    // object interaction
    public void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void equipArmor(Armor armor){
        this.armor = armor;
    }

    public void attack(Player opponet){
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name + " attacking " + opponet.name + " with power " + attackPower);

        // defence dipangil setelah keserang
        opponet.defence(attackPower);
    }

    public  void  defence(Double attackPower){
        double damage;
        if(this.armor.defencePower < attackPower){
            damage = attackPower - this.armor.defencePower;
        } else {
            damage = 0;
        }

        this.health -= damage;
        System.out.println(this.name + " gets damage " + damage);
    }


    public void display() {
        System.out.println("\nNama : " + this.name);
        System.out.println("Health : " + this.health +" hp");
        this.weapon.display();
        this.armor.display();
    }
}
