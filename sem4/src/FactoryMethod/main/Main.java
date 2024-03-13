package FactoryMethod.main;

import FactoryMethod.clase.PersonalSpital;
import FactoryMethod.fabrici.FabricaAsistent;
import FactoryMethod.fabrici.FabricaInfirmier;
import FactoryMethod.fabrici.FabricaMedic;
import FactoryMethod.fabrici.FactoryAngajati;

public class Main {
    public static void main(String[] args) {
        FactoryAngajati factoryAngajati = new FabricaAsistent();
        PersonalSpital angajatt1 = factoryAngajati.creareAngajat("Rares",1000);
        angajatt1.afisare();
        procesareAngajat(factoryAngajati,"andrei",1000);
        procesareAngajat(new FabricaMedic(),"sandu",1500);
        procesareAngajat(new FabricaInfirmier(),"Florin",1800);
    }
    public static void procesareAngajat(FactoryAngajati factoryAngajati,String nume, int salariu){
        PersonalSpital angajat = factoryAngajati.creareAngajat(nume,salariu);
        angajat.afisare();
    }
}
