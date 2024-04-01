package com.enigma.java_oop.constant;

// enum ini tetep sebuah class
// tapi menyimpan data yg unik yaitu data constant
public enum Gender {
    // enum tidak perlu akses modifier
    // enum harus mengikuti naming convention untul FINAL/CONSTAN atau disebut scream case
    // MALE = new Gender("Laki-laki")
    MALE("Laki-laki"),
    // FEMALE = new Gender("Perempuan")
    FEMALE("Perempuan");
    // Jadi ibarat kata/keyword MALE dan FEMALE ini sebuah object yg langsung di instance di tempat atau di dalam class Gender

    private String description;

    public String getDescription() {
        return description;
    }

    Gender(String description) {
        this.description = description;
    }

    public static String tes() {
        return "Test";
    }
}
