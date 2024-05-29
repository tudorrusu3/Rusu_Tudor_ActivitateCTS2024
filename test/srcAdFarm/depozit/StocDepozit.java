package depozit;

public class StocDepozit extends StocDepozitAbstract{
    @Override
    public boolean verificaStocPentruMedicament(int index, int numarBucati) {
        return this.listaStocMedicamente.get(index)>=numarBucati;
    }
}
