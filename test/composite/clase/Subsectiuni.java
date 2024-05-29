package clase;

import java.util.ArrayList;
import java.util.List;

public class Subsectiuni implements Meniu{
    private String denumire;
    private List<Meniu> lista;

    public Subsectiuni(String denumire) {
        this.denumire = denumire;
        lista = new ArrayList<>();
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
        System.out.println(indentare + "Subsectiune - " + denumire);
        for (Meniu meniu: lista) {
            meniu.afisare(indentare);
        }
    }
}
