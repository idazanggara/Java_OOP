package com.enigma.java_oop.example_static;

import com.enigma.java_oop.example_static.Constant;
import com.enigma.java_oop.example_static.Helper;

public class Main {
    public static void main(String[] args) {
        System.out.println(Constant.APPLICATION);
//        Constant.APPLICATION = "Java Fundamental";
//        System.out.println(Constant.APPLICATION);
        System.out.printf(Constant.SUCCESS_MESSAGE + "\n","Product");

        String inputan = Helper.inputString("Input kata-kata");
        String inputan1 = Helper.inputString("Input Nama Anda");

        System.out.println(inputan + " ini inputan kata2");
        System.out.println(inputan1 + " ini inputan nama");

        System.out.println(Helper.toRupiah(10000000)); // Rp 10,000

    }
}
