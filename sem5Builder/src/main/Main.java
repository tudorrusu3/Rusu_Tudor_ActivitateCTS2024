package main;

import model.AbstractBuilder;
import model.Pacient;
import model.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder builder = new PacientBuilder("Andrei");
        Pacient pacient = builder.adaugHalatInterior()
                .adaugaPapuciCamera().build();
//        pacient.setArePatRabatabil(true);
        System.out.println(pacient);
        //AbstractBuilder builder1 = new PacientBuilder("Ovidiu");
        Pacient pacient1 = builder.adaugaPatRabatibil().build();
        System.out.println(pacient1);
        System.out.println(pacient);

        }
    }