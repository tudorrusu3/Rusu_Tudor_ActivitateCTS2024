package model;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements AbstractReteta{
    private String numeMedicament;
    private Map<String,Double> compozitieMedicament;
    private double gramajMeicament;


    public Reteta(String numeMedicament, Map<String, Double> compozitieMedicament, double gramajMeicament) {
        this.numeMedicament = numeMedicament;
        this.compozitieMedicament = compozitieMedicament;
        this.gramajMeicament = gramajMeicament;
        Double suma = 0.0;
        for (Double cantitate:compozitieMedicament.values()
             ) {
            suma = suma + cantitate;
        }
        if(suma<gramajMeicament+0.1 && suma>gramajMeicament+0.1){
            throw new RuntimeException("gramaj incorect");
        }
    }
    private Reteta(){

    }

    @Override
    public AbstractReteta cloneaza() {
        Reteta reteta = new Reteta();
        reteta.numeMedicament = this.numeMedicament;
        reteta.compozitieMedicament = new HashMap<>();
        for(String cheie:this.compozitieMedicament.keySet()){
            reteta.compozitieMedicament.put(cheie,this.compozitieMedicament.get(cheie));
        }
        reteta.gramajMeicament = this.gramajMeicament;
        return reteta;
    }
    public void setNumeMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "numeMedicament='" + numeMedicament + '\'' +
                ", compozitieMedicament=" + compozitieMedicament +
                ", gramajMeicament=" + gramajMeicament +
                '}';
    }
}
