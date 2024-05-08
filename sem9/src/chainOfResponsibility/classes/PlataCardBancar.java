package chainOfResponsibility.classes;

public class PlataCardBancar extends ModDePlata {
    private double sold;

    public PlataCardBancar(double sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(double pret) {
        if(sold >= pret) {
            System.out.println("S a efectuat plata pentru calatoria in valoare de "
                    + pret + " cu cardul bancar");
            sold -= pret;
        }
        else{
            super.succesor.plateste(pret);
        }
    }
}
