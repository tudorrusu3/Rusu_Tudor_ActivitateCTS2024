package clase;

public class Client implements Flyweight{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void rezervaMasa(MasaRezervata masa) {
        System.out.println("Clientul "+nume
                +" a rezervat masa "+masa);
    }
}
