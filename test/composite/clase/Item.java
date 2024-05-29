package clase;

public class Item implements Meniu{
    private String denumire;

    public Item(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    @Override
    public void adauga(Meniu meniu) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sterge(Meniu meniu) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Meniu get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afisare(String indentare) {
        System.out.println(indentare+" Item- "+this.denumire);
    }
}
