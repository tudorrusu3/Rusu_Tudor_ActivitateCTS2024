package depozit;

import java.util.ArrayList;
import java.util.List;

public abstract class StocDepozitAbstract {
    protected List<Integer> listaStocMedicamente;

    public StocDepozitAbstract() {
        this.listaStocMedicamente = new ArrayList<>();
        this.listaStocMedicamente.add(20);
        this.listaStocMedicamente.add(30);
        this.listaStocMedicamente.add(10);
    }
    public abstract boolean verificaStocPentruMedicament(int index,int numarBucati);
}
