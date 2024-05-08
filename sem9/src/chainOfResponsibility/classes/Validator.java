package chainOfResponsibility.classes;

public class Validator {
    private int nrAutobuz;
    private ModDePlata modDePlata;

    public Validator(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
        this.modDePlata = new PlataCardCalatorii(1);
        ModDePlata cardBancar = new PlataCardBancar(5);
        modDePlata.setSuccesor(cardBancar);
        ModDePlata plataSms = new PlataSMS(3);
        cardBancar.setSuccesor(plataSms);
        ModDePlata controlor = new Controlor();
        plataSms.setSuccesor(controlor);
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public void setNrAutobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public ModDePlata getModDePlata() {
        return modDePlata;
    }

    public void setModDePlata(ModDePlata modDePlata) {
        this.modDePlata = modDePlata;
    }
    public void efectueazaPlata(float pret){
        modDePlata.plateste(pret);
    }
}
