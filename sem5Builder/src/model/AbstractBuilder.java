package model;

public interface AbstractBuilder {
    public abstract AbstractBuilder adaugaPatRabatibil();
    public abstract AbstractBuilder adaugaMicDejun();
    public abstract AbstractBuilder adaugaPapuciCamera();
    public abstract AbstractBuilder adaugHalatInterior();
    public abstract Pacient build();
}
