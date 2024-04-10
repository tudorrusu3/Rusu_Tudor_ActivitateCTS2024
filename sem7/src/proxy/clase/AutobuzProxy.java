package proxy.clase;

import java.util.ArrayList;
import java.util.List;

//proxy pentru "protest"
public class AutobuzProxy implements AutobuzAbstract {
    private List<String> statiiInterzise;
    private AutobuzAbstract autobuz;

    public AutobuzProxy(AutobuzAbstract autobuz) {
        this.autobuz = autobuz;
        statiiInterzise = new ArrayList<>();
    }

    public void adaugaStatie(String statie) {
        statiiInterzise.add(statie);
    }


    @Override
    public void opresteInStatie(String statie) {
        if (statiiInterzise.contains(statie)) {
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " nu mai opreste in statia " + statie);
        } else {
            autobuz.opresteInStatie(statie);
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
