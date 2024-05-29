package farmacie;

import java.util.ArrayList;
import java.util.List;

public abstract class StocFarmacieAbstract {
    protected List<Integer> listaStocMedicamente;
    protected int medicamentSetat;

    public StocFarmacieAbstract() {
        this.listaStocMedicamente = new ArrayList<>();
        this.listaStocMedicamente.add(20);
        this.listaStocMedicamente.add(30);
        this.listaStocMedicamente.add(10);
    }
    public abstract void setareMedicament(int index);
    public abstract boolean verificareDisponibilitate(int numarBucati);
}
