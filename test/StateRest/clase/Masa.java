package clase;

public class Masa {
    private int codMasa;
    private Stare stare;

    public Masa(int codMasa) {
        this.codMasa = codMasa;
        this.stare = new MasaLibera();
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }
    public void rezervareMasa(){
        if(this.stare instanceof MasaLibera){
            MasaRezervata masaRezervata = new MasaRezervata();
            masaRezervata.schimbaStare(this);
            System.out.println("Masa "+codMasa
                    +" a fost rezervata.");
        }else{
            System.out.println("Masa "+codMasa
                    +" nu este disponibila.");
        }
    }
    public void ocupareMasa(){
        if(this.stare instanceof MasaRezervata){
            MasaOcupata masaOcupata = new MasaOcupata();
            masaOcupata.schimbaStare(this);
            System.out.println("Masa "+codMasa
                    +" a fost ocupata.");
        }else{
            System.out.println("Masa "+codMasa
                    +" nu este disponibila.");
        }
    }
    public void eliberareMasa(){
        if(this.stare instanceof MasaOcupata){
            Stare stareEliberata=new MasaLibera();
            stareEliberata.schimbaStare(this);
            System.out.println("Masa "+codMasa
                    +" a fost eliberata.");
        }else{
            System.out.println("Masa "+codMasa
                    +" nu este disponibila.");
        }
    }
}
