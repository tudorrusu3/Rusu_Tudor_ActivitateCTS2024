package clase;

public abstract class ModDePlata {
    private ModDePlata succesor;
    public abstract void plateste(double pret);

    public ModDePlata getSuccesor() {
        return succesor;
    }

    public void setSuccesor(ModDePlata succesor) {
        this.succesor = succesor;
    }
}
