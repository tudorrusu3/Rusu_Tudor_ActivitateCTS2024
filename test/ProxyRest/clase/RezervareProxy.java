package clase;

public class RezervareProxy implements RezervareAbstracta{
    private RezervareAbstracta rezervareAbstracta;

    public RezervareProxy(RezervareAbstracta rezervareAbstracta) {
        this.rezervareAbstracta = rezervareAbstracta;
    }

    @Override
    public void rezerva() {
        if(rezervareAbstracta.getNrOameni()>=4){
            System.out.println("Rezervare in numele "
                    +rezervareAbstracta.getNume()+" pentru "+rezervareAbstracta.getNrOameni()
                    +" persoane "+ " a fost facuta pentru ora "
                    +rezervareAbstracta.getOra()+ " in data de "+rezervareAbstracta.getData());
        }else{
            System.out.println("Rezervarea nu a fost realizata. Exista suficiente locuri pentru mesele de doua persoane.");
        }
    }

    @Override
    public int getNrOameni() {
        return rezervareAbstracta.getNrOameni();
    }

    @Override
    public String getNume() {
        return rezervareAbstracta.getNume();
    }

    @Override
    public String getOra() {
        return rezervareAbstracta.getOra();
    }

    @Override
    public String getData() {
        return rezervareAbstracta.getData();
    }
}
