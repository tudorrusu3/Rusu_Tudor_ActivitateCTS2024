package clase;

public class Cash implements ModDePlata{
    @Override
    public void plateste(double pret) {
        System.out.println("s a platit cash suma de " + pret);
    }
}
