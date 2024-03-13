package program;

import clase.FactoryPersonal;
import clase.Medic;
import clase.PersonalSpital;
import clase.TipAngajat;

public class Main {
    public static void main(String[] args) {
        FactoryPersonal factoryPersonal = new FactoryPersonal();
        PersonalSpital medic = factoryPersonal.creareAngajat(TipAngajat.MEDIC,"Gigel",6500,10);
        medic.afisare();
        PersonalSpital asistent = factoryPersonal.creareAngajat(TipAngajat.ASISTENT,"Marius",5000,2);
        asistent.afisare();
    }
}