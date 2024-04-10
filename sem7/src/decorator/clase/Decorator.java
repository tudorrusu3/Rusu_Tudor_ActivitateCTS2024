package decorator.clase;

public abstract class Decorator implements BiletAbstract{
    private BiletAbstract bilet;

    public Decorator(BiletAbstract bilet) {
        this.bilet = bilet;
    }

    public abstract void reducerePret();

    public BiletAbstract getBilet() {
        return bilet;
    }
}
