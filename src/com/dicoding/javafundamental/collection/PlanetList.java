package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PlanetList {
    public static void main(String[] args) {
        String[] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "sven";
        //heroes[2] = "zeus"; //error ArrayIndexOutOfBoundsException karena ukuran Array tetap

        //List adalah suatu Collection di mana data yang masuk akan disimpan secara teratur
        List<String> planets = new ArrayList<>(); //Menggunakan salah satu implementasi dari list yaitu ArrayList, ArrayList mirip dengan Array hanya saja ArrayList ukurannya tidak tetap atau fleksibel
        planets.add("mercury"); // method add() untuk menambahkan objek ke List dari belakang
        planets.add("venus");
        planets.add("earth");
        planets.add("mars");
        System.out.println("List planets awal:");
        for (int i = 0; i < planets.size(); i++) {
            // method size() untuk mendapatkan ukuran List
            // method get() untuk melihat isi List pada index i (argumen fungsi)
            System.out.println("\t index-"+ i +" = " + planets.get(i));
        }

        try {
            System.out.println(planets.get(5));
        }catch (IndexOutOfBoundsException e) { //method get() akan mengembalikan error IndexOutOfBoundsException
            System.out.println(e);
        }

        planets.remove("venus"); // method remove() untuk mengeluarkan objek (argumen) dari List

        System.out.println("List planets akhir:");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index-"+ i +" = " + planets.get(i));
        }
    }
}
