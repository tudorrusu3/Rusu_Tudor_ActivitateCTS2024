package decorator.clase;

public class BiletAniversareStb extends Decorator {
    public BiletAniversareStb(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void printare() {
        getBilet().printare();
        System.out.println("La multi ani Stb");
    }

    @Override
    public void reducerePret() {
        ((Bilet) getBilet()).setPret(0);
    }
}
