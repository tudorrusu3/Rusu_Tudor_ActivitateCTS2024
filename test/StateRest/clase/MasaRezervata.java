package clase;

public class MasaRezervata implements Stare{
    @Override
    public void schimbaStare(Masa masa) {
        masa.setStare(this);
    }
}
