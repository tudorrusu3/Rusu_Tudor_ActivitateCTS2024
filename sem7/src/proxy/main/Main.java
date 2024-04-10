package proxy.main;

import proxy.clase.Autobuz;
import proxy.clase.AutobuzAbstract;
import proxy.clase.AutobuzDeNoapte;
import proxy.clase.AutobuzProxy;

public class Main {
    public static void main(String[] args) {
        AutobuzAbstract autobuz = new Autobuz(11, 212, "Andrei");
        autobuz.opresteInStatie("Piata Romana");
        //autobuzDeNoapte = proxy
        AutobuzAbstract autobuz1 = new AutobuzDeNoapte(autobuz);
        autobuz1.opresteInStatie("Piata Romana");

        AutobuzAbstract autobuz2 = new Autobuz(0, 168, "Tudor");
        AutobuzDeNoapte autobuz3 = new AutobuzDeNoapte(autobuz2);
        autobuz2.opresteInStatie("Piata Romana");
        autobuz3.opresteInStatie("Piata Romana");

        System.out.println();
        AutobuzProxy autobuzProxy = new AutobuzProxy(autobuz);
        autobuzProxy.adaugaStatie("Parc Drumul Taberei");
        autobuzProxy.adaugaStatie("Piata Unirii");
        autobuzProxy.opresteInStatie("Piata Romana");


    }
}
