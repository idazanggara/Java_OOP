package com.enigma.java_oop.constant;

import java.util.Arrays;

public enum Direction {
    NORTH, // 0
    EAST, // 1
    SOUTH, // 2
    WEST; // 3
//    NORTH, EAST, SOUTH, WEST;

    //     N
    //W         E
    //     S

    public Direction turnRight(){
//        System.out.println("===");
//        System.out.println(Arrays.toString(values()));
//        System.out.println((this.ordinal() ) + " --");
//        System.out.println((this.ordinal() + 1 + values().length) % values().length);
        return Direction.values()[(this.ordinal() + 1 + Direction.values().length) % Direction.values().length];
    }
    public Direction turnLeft(){

        return Direction.values()[(this.ordinal() - 1 + Direction.values().length) % Direction.values().length];
    }


}
