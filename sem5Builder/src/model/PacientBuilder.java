package model;

public class PacientBuilder implements AbstractBuilder{
    private Pacient pacient;

    public PacientBuilder(String numePacient) {
        this.pacient = new Pacient();
        pacient.setNume(numePacient);
    }

    @Override
    public AbstractBuilder adaugaPatRabatibil() {
        pacient.setArePatRabatabil(true);
        return this;
    }

    @Override
    public AbstractBuilder adaugaMicDejun() {
        pacient.setAreMicDejun(true);
        return this;
    }

    @Override
    public AbstractBuilder adaugaPapuciCamera() {
        pacient.setArePapuciCamera(true);
        return this;
    }

    @Override
    public AbstractBuilder adaugHalatInterior() {
        pacient.setAreHalatInterior(true);
        return this;
    }

    @Override
    public Pacient build() {
        return pacient;
    }
}
