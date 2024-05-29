package main;

import clase.NotaAbstracta;
import clase.NotaAniversara;
import clase.NotaDePlata;

public class Main {
    public static void main(String[] args) {
        NotaAbstracta nota = new NotaDePlata(10,1);
        nota.printare();
        NotaAbstracta notaAniversara = new NotaAniversara(nota);
        notaAniversara.printare();
    }
}
