package model.readers;

import model.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {
    abstract List< Aplicant> readAplicanti(String file) throws FileNotFoundException;

    public void citireAplicant(Scanner input2,Aplicant aplicant){
        String nume = input2.next();
        String prenume = input2.next();
        int varsta = input2.nextInt();
        int punctaj = input2.nextInt();
        int nr = input2.nextInt();
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = input2.next();
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setNr_proiecte(nr,vect);

    }
}
