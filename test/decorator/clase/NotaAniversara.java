package clase;

public class NotaAniversara extends Decorator{
    public NotaAniversara(NotaAbstracta nota) {
        super(nota);
    }


    @Override
    public void printare() {
        getNota().printare();
        System.out.println(" de ziua ta");
    }
}
