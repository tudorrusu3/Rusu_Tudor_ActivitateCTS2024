package main;

import clase.Client;
import clase.Flyweight;
import clase.FlyweightFactory;
import clase.MasaRezervata;

public class Main {
    public static void main(String[] args) {
        MasaRezervata masa = new MasaRezervata(3);
        FlyweightFactory factoryClient = new FlyweightFactory();
        factoryClient.getClient("tudor").rezervaMasa(masa);
    }
}
