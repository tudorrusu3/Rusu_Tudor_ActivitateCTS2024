package adapter;

import depozit.StocDepozitAbstract;
import farmacie.StocFarmacieAbstract;

public class AdapterStocFarmacie extends StocFarmacieAbstract {
    StocDepozitAbstract depozitAbstract;

    public AdapterStocFarmacie(StocDepozitAbstract depozitAbstract) {
        this.depozitAbstract = depozitAbstract;
    }

    @Override
    public void setareMedicament(int index) {

    }

    @Override
    public boolean verificareDisponibilitate(int numarBucati) {
        return false;
    }
}
