package strategy.classes;

public class PlataCardCalatorii implements ModDePlata{
    @Override
    public void plateste(double pret) {
        System.out.println("S a efecutat plata pentru calatoria in valoare de " +
                 + pret + " cu cardul de calatorii");
    }
}
