package clase;

public class MasaLibera implements Stare{
    @Override
    public void schimbaStare(Masa masa) {
        masa.setStare(this);
    }
}
