package clase;

public class Rezervare implements RezervareAbstracta{
    int nrPersoane;
    String numeRezervare;
    String oraRezervare;
    String dataRezervare;

    public Rezervare(int nrPersoane, String numaRezervare, String oraRezervare, String dataRezervare) {
        this.nrPersoane = nrPersoane;
        this.numeRezervare = numaRezervare;
        this.oraRezervare = oraRezervare;
        this.dataRezervare = dataRezervare;
    }

    @Override
    public void rezerva() {
        System.out.println("Rezervare in numele "
                +numeRezervare+" pentru "+nrPersoane
                +" persoane "+ " a fost facuta pentru ora "
                +oraRezervare+ "in data de "+dataRezervare);
    }

    @Override
    public int getNrOameni() {
        return nrPersoane;
    }

    @Override
    public String getNume() {
        return numeRezervare;
    }

    @Override
    public String getOra() {
        return oraRezervare;
    }

    @Override
    public String getData() {
        return dataRezervare;
    }
}
