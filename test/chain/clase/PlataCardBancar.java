package clase;

public class PlataCardBancar extends ModDePlata{
    private double sold;

    public PlataCardBancar(double sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(double pret) {
        if(sold>= pret){
            sold -= pret;
            System.out.println("S a efectuat plata cu cardul bancar in valoare de " + pret);
        }
        else {
            super.getSuccesor().plateste(pret);
        }
    }
}
