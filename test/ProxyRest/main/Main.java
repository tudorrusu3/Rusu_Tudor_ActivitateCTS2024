package main;

import clase.Rezervare;
import clase.RezervareAbstracta;
import clase.RezervareProxy;

public class Main {
    public static void main(String[] args) {
        RezervareAbstracta rezevare = new Rezervare(1,"2","7","10");
        rezevare.rezerva();
        RezervareAbstracta rezervareProxy = new RezervareProxy(rezevare);
        rezervareProxy.rezerva();
    }
}
