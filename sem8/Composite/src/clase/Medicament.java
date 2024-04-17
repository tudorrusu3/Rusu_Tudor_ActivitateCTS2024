package clase;

public class Medicament implements StructuraAbstracta{
    private String numeMedicament;
    private double pret;

    public Medicament(String numeMedicament, double pret) {
        this.numeMedicament = numeMedicament;
        this.pret = pret;
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public void adaugareCategorie(StructuraAbstracta structuraAbstracta) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergereCategorie(StructuraAbstracta structuraAbstracta) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afisareProspect(String indentare) {
        System.out.println(indentare + "Medicamentul cu numele "+ this.numeMedicament + " are pretul de " + this.pret);
    }

    @Override
    public StructuraAbstracta getCategorie(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void calculeazaPret(double procentDiscount) {
        this.pret = this.pret*(1-procentDiscount);
    }
}
