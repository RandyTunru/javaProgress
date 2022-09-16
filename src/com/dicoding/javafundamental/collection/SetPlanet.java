package com.dicoding.javafundamental.collection;

import java.util.*;

public class SetPlanet {
    public static void main(String[] args) {
        //Set mirip dengan List hanya saja objek di dalam Set tidak bisa diduplikasi, jika objek yang sama dimasukkan beberapa kali ke dalam Set maka Set hanya akan menyimpan objek tersebut satu kali saja.
        Set<String> planets = new HashSet<>(); // menggunakan salah satu implementasi dari set yaitu HashSet
        planets.add("mercury"); // method add() untuk menambahkan objek ke Set di belakang
        planets.add("venus");
        planets.add("earth");
        planets.add("earth"); // menambahkan objek "earth" beberapa kali
        planets.add("earth");
        planets.add("mars"); // objek bisa terus ditambahkan ke Set

        // method size() untuk mendapatkan ukuran Set
        System.out.println("Set planets awal: (size = " + planets.size() + ")");
        for (String planet : planets) { //looping menggunakan for-each loop dimana String planet adalah inisialisasi dan planet akan menampung elemen dari planets untuk setiap iterasi, looping akan berhenti ketika seluruh elemen dari planets sudah dilewati
            System.out.println("\t " + planet);
        }

        planets.remove("venus"); // method remove() untuk mengeluarkan objek dari Set

        System.out.println("Set planets akhir: (size = " + planets.size() + ")");
        //method iterator() mengembalikan iterator dari HashSet (tipe data reference Iterator)
        //method hasNext() akan melakukan pengecekan apakah masih ada elemen selanjutnya, jika ada maka mengembalikan true, jika tidak maka mengembalikan false
        for (Iterator iterator = planets.iterator(); iterator.hasNext(); ) {
            // looping menggunakan Iterator
            System.out.println("\t " + iterator.next()); //method next() akan mengembalikan elemen iterasi sekaligus memindahkan iterasi ke langkah selanjutnya
        }
    }
}
