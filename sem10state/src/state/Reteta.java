package state;

public class Reteta {
    private int nrMedicamente;
    private float pret;
    private int nrReteta;
    private AbstractState stare;

    public Reteta(int nrMedicamente, float pret, int nrReteta) {
        this.nrMedicamente = nrMedicamente;
        this.pret = pret;
        this.nrReteta = nrReteta;
        this.stare = new  Emisa();
    }

    protected void setStare(AbstractState stare) {
        this.stare = stare;
    }
    public void cerereMedicamente(){
        if(stare instanceof Emisa){
            System.out.println("Au fost solicitate "+ nrMedicamente + " medicamente in baza retetei cu nr " + nrReteta);
            AbstractState solicitata = new Solicitata();
            solicitata.schimbaStare(this);
        }
        else{
            System.out.println("Nu puteti lua medicamente in baza acestei retete");
        }
    }
    public void cumparareMedicamente(){
        if(stare instanceof Solicitata){
            System.out.println("Au fost achizitionate " + nrMedicamente + " in baza retetei cu nr " + nrReteta);
            AbstractState achizitionata = new Achizitionata();
            achizitionata.schimbaStare(this);
        }
        else{
            System.out.println("Nu puteti lua medicamente in baza acestei retete");
        }
    }
    public void respingeReteta(){
        if(stare instanceof Solicitata){
            System.out.println("Nu avem aceste medicamente");
            AbstractState emisa = new Emisa();
            emisa.schimbaStare(this);
        }
        else{
            System.out.println("Reteta nu a fost solicitata");
        }
    }
}
