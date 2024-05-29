package clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiuni implements Meniu{
    private List<Meniu> lista;
    private String denumire;

    public Sectiuni(String denumire) {
        this.lista = new ArrayList<>();
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    @Override
    public void adauga(Meniu meniu) {
        lista.add(meniu);
    }

    @Override
    public void sterge(Meniu meniu) {
        lista.remove(meniu);
    }

    @Override
    public Meniu get(int index) {
        if(index>=0 && index<this.lista.size()){
            return this.lista.get(index);
        }
        return null;
    }

    @Override
    public void afisare(String indentare) {
        System.out.println(indentare + "Sectiune - " + denumire);
        for (Meniu meniu: lista) {
            meniu.afisare(indentare+ indentare);
        }
    }
}
