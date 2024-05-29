package clase;

public interface Meniu {
    void adauga(Meniu meniu);
    void sterge(Meniu meniu);
    Meniu get(int index);
    void afisare(String indentare);
}
