package clase;

import java.util.ArrayList;
import java.util.List;

public class Receptionist {
    List<Integer> listaMese;

    public Receptionist() {
        this.listaMese = new ArrayList<>();
        this.listaMese.add(0);
        this.listaMese.add(0);
        this.listaMese.add(0);
        this.listaMese.add(1);
        this.listaMese.add(1);
    }
    public boolean eMasaLibera(){
        System.out.println("Sunt mese libere");
        return this.listaMese.contains(0);
    }
    public void verifcaDebarasare(){
        System.out.println("s a debarasat masa");
    }
    public void verificaServetele(){
        System.out.println("S au pus servetele pe masa");
    }
}
