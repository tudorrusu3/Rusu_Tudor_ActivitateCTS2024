package clase;

public interface StructuraAbstracta {
    void adaugareCategorie(StructuraAbstracta structuraAbstracta);
    void stergereCategorie(StructuraAbstracta structuraAbstracta);
    void afisareProspect(String indentare);
    StructuraAbstracta getCategorie(int index);
    void calculeazaPret(double procentDiscount);
}
