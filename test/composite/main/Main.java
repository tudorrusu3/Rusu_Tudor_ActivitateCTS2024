package main;

import clase.Item;
import clase.Meniu;
import clase.Sectiuni;
import clase.Subsectiuni;

public class Main {
    public static void main(String[] args) {
        Meniu bauturi = new Sectiuni("Bauturi");

        Meniu sucuri = new Subsectiuni("sucuri");
        Meniu alcool = new Subsectiuni("alcool");

        Meniu cola = new Item("cola");
        Meniu pepsi = new Item("pepsi");

        Meniu jack = new Item("jack");

        bauturi.adauga(sucuri);
        bauturi.adauga(alcool);

        sucuri.adauga(cola);
        sucuri.adauga(pepsi);

        alcool.adauga(jack);

        bauturi.afisare(" ");
    }
}
