package strategy.classes;

public class PlataCardBancar implements ModDePlata{
    @Override
    public void plateste(double pret) {
        System.out.println("S a efectuat plata pentru calatoria in valoare de "
        + pret + " cu cardul bancar");
    }
}
