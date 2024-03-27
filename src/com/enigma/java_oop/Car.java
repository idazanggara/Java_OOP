package com.enigma.java_oop;
// 4 Pilar OOP (Encapsulation, Inheritance, Polymorphism, Abstraction)
public class Car {

    static String label = "ini class car";
    static int count;
    public String color;
    public Integer wheel;
    public String brand ;
    private Integer fuel;
    public boolean isMatic = false;
    // access_modifier final static/non-static data_type variable_name
    // access_modifier data_type variable_name

    public static void testStatic(){

        System.out.println("Ini test Static " + Car.label + " | " + Car.count);
    }

    public Car(String color, Integer wheel, String brand){
        Car.count++;
        this.color = color;
        this.wheel = wheel;
        this.brand = brand;
        this.fuel = 0;
    }
    // polymorphism, constructor bisa dibuat lebih dari 1, dengan catatan bisa membuat dengan parameter yang berbeda serta urutan tipe data
    public Car(){

    }

    // Setter
//    public void setFuel(Integer fuel){
//        this.fuel = fuel + 5;
//    }
//
//
//    public Integer getFuel(){
//        /*this.fuel = 10;*/
//        return  this.fuel - 5;
//    }
//
//
//    public String print(){
//        return "Car {"+
//                "\n\tcolor="+ this.color + ",\t"+
//                "\n\twheel="+ this.wheel + ",\t"+
//                "\n\tbrand="+ this.brand + ",\t"+
//                "\n\tfuel="+ this.fuel + "\n" +
//                "}";
//
//    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWheel() {
        return wheel;
    }

    public void setWheel(Integer wheel) {
        this.wheel = wheel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getFuel() {
        return fuel;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    public boolean isMatic() {
        return isMatic;
    }

    public void setMatic(boolean matic) {
        isMatic = matic;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", wheel=" + wheel +
                ", brand='" + brand + '\'' +
                ", fuel=" + fuel +
                ", isMatic=" + isMatic +
                '}';
    }

}
