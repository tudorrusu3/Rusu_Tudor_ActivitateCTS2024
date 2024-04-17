package clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements StructuraAbstracta {
    private List<StructuraAbstracta> medicamente = new ArrayList<>();
    private double procent;
    private String denumire;

    public Categorie(double procent, String denumire) {
        this.procent = procent;
        this.denumire = denumire;
    }

    public double getProcent() {
        return procent;
    }

    public String getDenumire() {
        return denumire;
    }

    @Override
    public void adaugareCategorie(StructuraAbstracta structuraAbstracta) {
        medicamente.add(structuraAbstracta);
    }

    @Override
    public void stergereCategorie(StructuraAbstracta structuraAbstracta) {
        medicamente.remove(structuraAbstracta);
    }

    @Override
    public void afisareProspect(String indentare) {
        System.out.println("Categoria " + this.denumire + " are urmatoarele categorii ");
        for(StructuraAbstracta sa:medicamente){
            sa.afisareProspect( " ");
        }
    }

    @Override
    public StructuraAbstracta getCategorie(int index) {
        if(index>=0 && index<this.medicamente.size()){
            return  this.medicamente.get(index);
        }
        else{
            return null;
        }
    }

    @Override
    public void calculeazaPret(double procentDiscount) {
        for(StructuraAbstracta sa: medicamente){
            sa.calculeazaPret(procentDiscount);
        }
    }
}
