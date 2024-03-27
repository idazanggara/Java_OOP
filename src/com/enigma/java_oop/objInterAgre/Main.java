package com.enigma.java_oop.objInterAgre;

import com.enigma.java_oop.objInterAgre.Armor;
import com.enigma.java_oop.objInterAgre.Player;
import com.enigma.java_oop.objInterAgre.Weapon;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Ucup", 100.0);
        Armor armor1 = new Armor("Jirah", 10.0);
        Weapon weapon1 = new Weapon("Pedang", 20.0);

        player1.equipWeapon(weapon1);
        player1.equipArmor(armor1);
        player1.display();

        Player player2 = new Player("Otong", 80.0);
        Armor armor2 = new Armor("Kaos", 0.0);
        Weapon weapon2 = new Weapon("Katapel", 5.0);

        player2.equipWeapon(weapon2);
        player2.equipArmor(armor2);
        player2.display();

        System.out.println("==\t War Time \t==");
        player1.attack(player2);
        player1.display();
        player2.display();
    }
}
