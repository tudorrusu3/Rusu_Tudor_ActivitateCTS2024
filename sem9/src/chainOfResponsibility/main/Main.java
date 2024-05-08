package chainOfResponsibility.main;

import chainOfResponsibility.classes.Validator;

public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator(168);
        validator.efectueazaPlata(3);
        validator.efectueazaPlata(3);
        validator.efectueazaPlata(3);
        validator.efectueazaPlata(3);
        validator.efectueazaPlata(3);
    }
}
