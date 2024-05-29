package clase;

public class MasaOcupata implements Stare{
    @Override
    public void schimbaStare(Masa masa) {
        masa.setStare(this);
    }
}
