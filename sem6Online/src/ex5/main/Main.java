package ex5.main;

import ex5.model.Autobuz;
import ex5.model.FacadeAutobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz();
        System.out.println("FARA FACADE\n");
        autobuz.punePeLiberUsaDinSpate();
        autobuz.deschidereUsaDinSpate();
        FacadeAutobuz fAutobuz = new FacadeAutobuz(autobuz);
        System.out.println("\nCU FACADE\n");
        fAutobuz.punePeLiberToateUsile();
        fAutobuz.deschideToateUsile();
    }
}
