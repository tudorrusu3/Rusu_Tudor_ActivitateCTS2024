package clase;

public class Medic extends PersonalSpital{
    private int vechime;
    public Medic(String nume, int salariu) {
        super(nume, salariu);
        this.vechime = 0;
    }

    public Medic(String nume, int salariu, int vechime) {
        super(nume, salariu);
        this.vechime = vechime;
    }

    public int getVechime() {
        return vechime;
    }

    @Override
    public void afisare() {
        System.out.println("Medicul " + super.getNume() + " are salariul " +super.getSalariu()+" si o vechime de "
        +getVechime());
    }
}
