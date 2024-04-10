package decorator.clase;

public class BiletSarbatori extends Decorator {
    private static double discount = 0.1;
    public BiletSarbatori(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void printare() {
        getBilet().printare();
        System.out.println("Sarbatori fericite!");
    }

    @Override
    public void reducerePret() {
        double pretNou = ((Bilet)getBilet()).getPret() - ((Bilet)getBilet()).getPret()*discount;
        ((Bilet)getBilet()).setPret((int) pretNou);
    }
}
