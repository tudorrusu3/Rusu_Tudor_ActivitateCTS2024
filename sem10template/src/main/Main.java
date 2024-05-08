package main;

import clase.AchizitieMedicamentePeBazaReteta;

public class Main {
    public static void main(String[] args) {
        AchizitieMedicamentePeBazaReteta reteta = new AchizitieMedicamentePeBazaReteta("Vitamina C");
        reteta.cumparareMedicament();
        AchizitieMedicamentePeBazaReteta medicament2 = new AchizitieMedicamentePeBazaReteta("Paracetamol");
        medicament2.cumparareMedicament();
    }
}
