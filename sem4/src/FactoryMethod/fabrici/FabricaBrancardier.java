package FactoryMethod.fabrici;

import FactoryMethod.clase.Brancardier;
import FactoryMethod.clase.PersonalSpital;

public class FabricaBrancardier implements FactoryAngajati{
    @Override
    public PersonalSpital creareAngajat(String nume, int salariu) {
        return new Brancardier(nume,salariu);
    }
}
