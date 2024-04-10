package proxy.clase;

public class AutobuzDeNoapte implements AutobuzAbstract {
    private AutobuzAbstract autobuz;

    public AutobuzDeNoapte(AutobuzAbstract autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie(String statie) {
        if (autobuz.getNrLocuri() > 0) {
            autobuz.opresteInStatie(statie);
        } else {
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " nu a oprit in " + statie);
        }
    }

    @Override
    public int getNrAutobuz() {
        return autobuz.getNrAutobuz();
    }

    @Override
    public int getNrLocuri() {
        return autobuz.getNrLocuri();
    }
}
