class Human {
    // Property/attribute/field/ variable super
    String nama ;
    int umur;
    boolean status;

    // shadowing parameter pada attribute jika kita tikda menggunakan kata kunci `this` dan ketika nama parameter sama dengan nama attribute
    // this ini mewakili si object
    Human(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
        this.status = false;
    }

    Human(){
        this.nama = "Ucup";
        this.umur = 0;
        this.status = false;
    }
    void makan() {
        System.out.println("nyam-nyam");
    }
    void belajar() {
        System.out.println("belajar");
    }

    String print(){
        return "Human {" +
                "nama="+ this.nama +" "+
                "umur="+ this.umur +" "+
                "status="+ this.status +
                "}";
    }
}

public class Main {
    public static void main(String[] args) {
        // Object adalah representasi hasil dari sebuah blueprint/class
        // membuat object itu sama seperti membuat variable
        // membuat object disebut juga dengan instance.
        // class kita adalah tipe data dan termasuk non primitive/class

//        Human dokter = new Human(); // instance
        // cara 1 untuk assign data ke property
//        dokter.nama = "Otong";
//        dokter.umur = 40;
//        System.out.println(dokter.nama);
//        System.out.println(dokter.umur);

        // cara ke 2 untuk assign data ke property
        // sebuah method yg namanya itu sama derngan nama class
        // method constructor akan di panggil pada saat pertama kali object itu dibuat
        Human dokter = new Human("Otong", 40); // instance
//        System.out.println(dokter.nama);
//        System.out.println(dokter.umur);
        dokter.nama = "====";
        dokter.umur = 100000;
        System.out.println(dokter.nama);
        System.out.println(dokter.umur);
        dokter.makan();
        dokter.belajar();

        Human petani = new Human("Acong", 30);
//        System.out.println(petani.nama);
//        System.out.println(petani.umur);
//        System.out.println(petani.status);
        System.out.println(petani.print());

        Human dokter2 = new Human();
        System.out.println(dokter2.nama);


        Human[] arrHum = new Human[]{
                dokter,
                petani,
                dokter2,
                new Human("Acong", 30)
        };

        System.out.println(dokter2.print());

        for (var arr:arrHum) {
            System.out.println(arr.print());
        }



    }
}