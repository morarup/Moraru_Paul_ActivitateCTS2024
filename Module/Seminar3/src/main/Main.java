package main;

import classes.ConexiuneBazaDeDate;

public class Main {
    public static void main(String[] args) {
        ConexiuneBazaDeDate conexiune1 = ConexiuneBazaDeDate.getInstance("Baza1", 20, "link1");
        ConexiuneBazaDeDate conexiune2 = ConexiuneBazaDeDate.getInstance("Baza2", 10, "link2");

        System.out.println(conexiune1);

        conexiune1.setNumeBaza("NumeBazaNoua");
        System.out.println(conexiune1);

        System.out.println(conexiune2);



    }
}