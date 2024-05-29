package main;

import clase.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(1);

        masa.rezervareMasa();
        masa.ocupareMasa();
        masa.eliberareMasa();

        masa.ocupareMasa();
    }
}
