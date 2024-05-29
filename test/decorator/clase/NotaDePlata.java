package clase;

public class NotaDePlata implements NotaAbstracta{
    private double pret;
    private int cod;

    public NotaDePlata(double pret, int cod) {
        this.pret = pret;
        this.cod = cod;
    }

    public double getPret() {
        return pret;
    }

    public int getCod() {
        return cod;
    }

    @Override
    public void printare() {
        System.out.println("S a printat nota cu codul " + cod +" in valoare de "+ pret);
    }
}
