package clase;

public class AchizitieMedicamentePeBazaReteta extends Template{
    private String numeMedicament;

    public AchizitieMedicamentePeBazaReteta(String numeMedicament) {
        super();
        this.numeMedicament = numeMedicament;
    }

    @Override
    protected void primireReteta() {
        System.out.println("Am primit reteta pentru medicamentul " + numeMedicament);
    }

    @Override
    protected boolean verificareStoc() {
        return super.stocuri.containsKey(numeMedicament);
    }

    @Override
    protected void incaseaza() {
        System.out.println("Am incasat banii pentru reteta " + numeMedicament);
    }

    @Override
        protected void aducereMedicamente() {
        System.out.println("Medicamentul " + numeMedicament + " este adus din depozit");
        if(stocuri.get(numeMedicament)>1) {
            super.stocuri.replace(numeMedicament, stocuri.get(numeMedicament) - 1);
        }
        else{
            stocuri.remove(numeMedicament);
        }
    }

    @Override
    protected void emiteBon() {
        System.out.println("A fost emis bonul");
    }

    @Override
    protected void respingeAchizitie() {
        System.out.println("Achizitia a fost respinsa");
    }
}
