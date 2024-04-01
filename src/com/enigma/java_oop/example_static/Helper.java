package com.enigma.java_oop.example_static;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Helper {
    public static String inputString(String info){
        Scanner scanner = new  Scanner(System.in);
//        System.out.printf("%s : ",info);
//        return scanner.nextLine();
        while (true) {
            System.out.printf("%s : ",info);
            String input = scanner.nextLine();
//            if(!input.isEmpty() && !input.isBlank()){
//                return input;
//            }
            // or
            if(input.isEmpty() || input.isBlank()){
                continue;
            }
            return input;
        }
    }

    public static String toRupiah(int value){
        DecimalFormat formatter = new DecimalFormat("Rp #,###");
        return formatter.format(value);


    }

}
