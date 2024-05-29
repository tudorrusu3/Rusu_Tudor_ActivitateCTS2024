package clase;

public class MasaRezervata {
    private int nrMasa;

    public MasaRezervata(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MasaRezervata{");
        sb.append("nrMasa=").append(nrMasa);
        sb.append('}');
        return sb.toString();
    }
}
