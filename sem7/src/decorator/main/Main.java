package decorator.main;

import decorator.clase.*;

public class Main {
    public static void printareBilet(BiletAbstract bilet){
        bilet.printare();
    }
    public static void main(String[] args) {
        BiletAbstract bilet = new Bilet(30,"af211");
        printareBilet(bilet);

        Decorator decorator = new BiletSarbatori(bilet);
        decorator.reducerePret();
        printareBilet(decorator);

        Decorator decorator1  = new BiletAniversareStb(bilet);
        printareBilet(decorator1);

        Decorator decorator2 = new BiletAniversareStb(decorator);
        printareBilet(decorator2);
    }
}