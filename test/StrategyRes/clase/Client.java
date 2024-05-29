package clase;

public class Client {
    private ModDePlata modDePlata;
    private double sumaDePlata;

    public Client(double sumaDePlata) {
        this.sumaDePlata = sumaDePlata;
        modDePlata = new Card();
    }

    public ModDePlata getModDePlata() {
        return modDePlata;
    }

    public void setModDePlata(ModDePlata modDePlata) {
        this.modDePlata = modDePlata;
    }
    public void plateste(){
        modDePlata.plateste(sumaDePlata);
    }
}
