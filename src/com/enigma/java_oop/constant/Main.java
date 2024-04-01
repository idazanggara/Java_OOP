package com.enigma.java_oop.constant;

import com.enigma.java_oop.constant.Direction;
import com.enigma.java_oop.constant.Gender;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Gender gender = new Gender();
//        System.out.println(Gender.MALE);
//        System.out.println(Gender.FEMALE );
//        System.out.println(Gender.FEMALE instanceof String); ingat ini bukan string, tapi Object dari Gender
//        System.out.println(Gender.FEMALE.toString() instanceof String);
//        System.out.println(Gender.FEMALE.toString() != null);

//        System.out.println(Arrays.toString(Gender.values()));

        // gimana cara akses property dan methodnya?
//        System.out.println(Gender.MALE.getDescription());
//        System.out.println(Gender.tes());

        // Bahas method" yg di miliki enum
        // 1. method static yg nempel di classnya
        // values() : untuk menampilkan semua data enum dari atas ke bawah dalam bentuk array
//        System.out.println(Arrays.toString(Direction.values()));
        // valueOf() : pencarian data enum dari valuenya yg kita lihat berbentuk string
//        Direction north = new Direction("NORTH");
//        Direction north = Direction.valueOf("NORTH"); // ini bentuknya object
//        System.out.println(north);

        // 2. method non-staticnya
        // name() : untuk mengubah/menampilkan valuenya dari data enum ke string
//        System.out.println(north.name());
//        if ( north.name() instanceof String){
//            System.out.println("betul betul");
//        }
        // ordinal() : sama seeperti array, dia mengembalikan nilai index dari object enumnya, urutannya dari atas ke bawah
//        System.out.println(north.ordinal());
//        System.out.println(Direction.values()[2]);

//        System.out.println(Direction.SOUTH.turnRight());
//        System.out.println(Direction.WEST.turnRight());
        System.out.println(Direction.WEST.turnLeft());

//        LocalDate dataNow = LocalDate.of(2023, Month.APRIL, DayOfWeek.SUNDAY);




    }
}
