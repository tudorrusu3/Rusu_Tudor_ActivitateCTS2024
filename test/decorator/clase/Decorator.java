package clase;

public abstract class Decorator implements NotaAbstracta{
    private NotaAbstracta nota;

    public Decorator(NotaAbstracta nota) {
        this.nota = nota;
    }

    public NotaAbstracta getNota() {
        return nota;
    }
}
