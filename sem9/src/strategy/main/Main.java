package strategy.main;

import strategy.classes.PlataCardBancar;
import strategy.classes.PlataCardCalatorii;
import strategy.classes.PlataSMS;
import strategy.classes.Validator;

public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator(23,new PlataSMS());
        validator.efectueazaPlata(3);

        validator.setModDePlata(new PlataCardCalatorii());
        validator.efectueazaPlata(3);

        validator.setModDePlata(new PlataCardBancar());
        validator.efectueazaPlata(3);
    }
}
