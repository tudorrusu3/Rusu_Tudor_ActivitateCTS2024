package clase;

public class PlataSMS extends ModDePlata{
    private double credit;

    public PlataSMS(double credit) {
        this.credit = credit;
    }
    @Override
    public void plateste(double pret) {
        if (credit > pret) {
            System.out.println("S-a efectuat plata pentru calatoria in valoare de " +
                    pret + " prin sms");
            credit -= pret;
        } else {
            getSuccesor().plateste(pret);
        }
    }
}
