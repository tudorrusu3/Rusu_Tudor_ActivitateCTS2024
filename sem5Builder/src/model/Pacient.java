package model;

public class Pacient {
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuciCamera;
    private boolean areHalatInterior;

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", arePatRabatabil=" + arePatRabatabil +
                ", areMicDejun=" + areMicDejun +
                ", arePapuciCamera=" + arePapuciCamera +
                ", areHalatInterior=" + areHalatInterior +
                '}';
    }

    protected Pacient() {
    }


    protected void setNume(String nume) {
        this.nume = nume;
    }

    protected void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }


    protected void setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
    }


    protected void setArePapuciCamera(boolean arePapuciCamera) {
        this.arePapuciCamera = arePapuciCamera;
    }

    protected void setAreHalatInterior(boolean areHalatInterior) {
        this.areHalatInterior = areHalatInterior;
    }
}
