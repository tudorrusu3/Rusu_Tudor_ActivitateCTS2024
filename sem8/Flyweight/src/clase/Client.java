package clase;

public class Client implements Flyweight {
    private String nume;
    private String nrAsigurare;

    public Client(String nume, String nrAsigurare) {
        this.nume = nume;
        this.nrAsigurare = nrAsigurare;
    }

    @Override
    public void achizitieReteta(Reteta reteta) {
        System.out.println("Clientul " + nume + " cu numarul de asigurare " + nrAsigurare + " achizitioneaza reteta " + reteta.toString());
    }
}