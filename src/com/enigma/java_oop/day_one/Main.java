package com.enigma.java_oop.day_one;

import com.enigma.java_oop.day_one.terminal.Console;

public class Main {
    public static void main(String[] args) {
        Car supra = new Car("Hitam", 4, "Toyota");



        Car[] arr = new Car[]{
                new Car("Hitam", 4, "Toyota"),
                new Car("Hitam", 4, "Toyota"),
                new Car("Hitam", 4, "Toyota")
        };
        supra.color = "Hitam";
//        supra.fuel = 10; ini error karena private // direct access
        supra.setFuel(60);
        System.out.println(supra.getFuel());

        System.out.println(supra.color);
        System.out.println(supra.toString());

        System.out.println(Car.label);
        supra.testStatic();
        arr[2].testStatic();

        Console.log("Hello world!");
        sebuahFunction();

    }

// A.  Hak Akses (Access Modifier)
    // 1. default = kalau kita tidak menentukan access mofifier maka masuk default, bisa dikases diluar class tapi tetap satu package
    // 2. private = attribute/method hanya dapat diakses didalam kelas yg sama
    // 3 public = attribute/method dapat diakses dari mana saja dan package mana saja
    // 4 protected = attribute/method dapat diakses dari kelas yg sama dan kelas turunannya

// B. Setter & Getter -> adalah sebuah fungsi/method
    // 1. Get = Mendapatkan data/attribute/property
    // 2. Set = Merubah data/attribute/property

    public static void sebuahFunction(){
        System.out.println("test");
    }
}
