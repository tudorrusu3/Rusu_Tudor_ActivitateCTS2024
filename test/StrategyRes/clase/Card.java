package clase;

public class Card implements ModDePlata{
    @Override
    public void plateste(double pret) {
        System.out.println("s a platit cu cardul suma de " + pret);
    }
}
