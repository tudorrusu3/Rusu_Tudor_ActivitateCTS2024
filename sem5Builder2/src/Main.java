import model.AbstractBuilder;
import model.Pacient;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AbstractBuilder builder=new Pacient.PacientBuilder("Andrei");
        Pacient pacient=builder.adaugaMicDejunInclus(true).adaugaPapuciCamera(true).build();
        System.out.println(pacient);
    }
}