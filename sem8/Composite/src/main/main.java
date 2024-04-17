package main;

import clase.Categorie;
import clase.Medicament;
import clase.StructuraAbstracta;

public class main {
    public static void main(String[] args) {
        StructuraAbstracta medicamente = new Categorie(0.1,"Medicamente");
        StructuraAbstracta raceala = new Categorie(0.2,"Raceala");
        StructuraAbstracta durere = new Categorie(0.3,"Durere");
        StructuraAbstracta copii = new Categorie(0.3,"Copii");
        StructuraAbstracta adulti = new Categorie(0.1,"Adulti");
        StructuraAbstracta nurofen = new Medicament("Nurofen",15);
        StructuraAbstracta paracetamol = new Medicament("Paracetamol",10);
        StructuraAbstracta nurofenJunior = new Medicament("NurofenJunior",8);
        StructuraAbstracta mig400 = new Medicament("Mig400",8);

        medicamente.adaugareCategorie(raceala);
        medicamente.adaugareCategorie(durere);

        raceala.adaugareCategorie(copii);
        raceala.adaugareCategorie(adulti);

        durere.adaugareCategorie(mig400);

        adulti.adaugareCategorie(nurofen);
        copii.adaugareCategorie(nurofenJunior);
        raceala.adaugareCategorie(paracetamol);

        medicamente.afisareProspect(" ");

        raceala.calculeazaPret(0.1);

        medicamente.afisareProspect(" ");
    }
}
