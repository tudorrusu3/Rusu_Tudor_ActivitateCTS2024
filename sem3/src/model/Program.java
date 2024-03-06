package model;

import singleton.Guvern;


public class Program {

    public static void main(String[] args) {
        Guvern guvern = Guvern.getInstance(5,"Manole",36);
        Guvern guvern2 = Guvern.getInstance(4,"Marcel",12);

        System.out.println(guvern);
        System.out.println(guvern2);
    }
}
