package decorator.clase;

public class Bilet implements BiletAbstract {
    private int pret;
    private String cod;

    public Bilet(int pret, String cod) {
        this.pret = pret;
        this.cod = cod;
    }

    @Override
    public void printare() {
        System.out.println("Pretul biletului " + cod + " este " + pret);
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int getPret() {
        return pret;
    }

    public String getCod() {
        return cod;
    }
}
