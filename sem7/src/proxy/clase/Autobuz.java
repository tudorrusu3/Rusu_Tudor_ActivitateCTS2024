package proxy.clase;

public class Autobuz implements AutobuzAbstract {
    private int nrLocuri;
    private int nrAutobuz;
    private String numeSofer;

    @Override
    public void opresteInStatie(String statie) {
        System.out.println("Autobuzul " + nrAutobuz + " condus de " + numeSofer + " a oprit in statia " + statie);
    }

    public Autobuz(int nrLocuri, int nrAutobuz, String numeSofer) {
        this.nrLocuri = nrLocuri;
        this.nrAutobuz = nrAutobuz;
        this.numeSofer = numeSofer;
    }

    @Override
    public int getNrLocuri() {
        return nrLocuri;
    }

    @Override
    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public String getNumeSofer() {
        return numeSofer;
    }
}
