package clase;

public class Reteta {
    private  String nume;
    private double suma;
    private  int nrMedicamente;

    public Reteta(String nume, double suma, int nrMedicamente) {
        this.nume = nume;
        this.suma = suma;
        this.nrMedicamente = nrMedicamente;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public int getNrMedicamente() {
        return nrMedicamente;
    }

    public void setNrMedicamente(int nrMedicamente) {
        this.nrMedicamente = nrMedicamente;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", suma=").append(suma);
        sb.append(", nrMedicamente=").append(nrMedicamente);
        sb.append('}');
        return sb.toString();
    }
}