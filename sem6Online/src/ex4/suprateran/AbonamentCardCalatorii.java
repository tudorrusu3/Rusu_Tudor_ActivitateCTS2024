package ex4.suprateran;

import java.util.GregorianCalendar;

public class AbonamentCardCalatorii extends CardSTB{

    private GregorianCalendar dataExpirareAbonament;
    public AbonamentCardCalatorii(String numeClient, String cnpClient) {
        super(numeClient, cnpClient);
        this.dataExpirareAbonament=new GregorianCalendar();
    }

    @Override
    public void validareCalatorie() {
        if(this.dataExpirareAbonament.before(new GregorianCalendar())){
            System.out.println("Calatorie placuta!");
        }else{
            System.out.println("Abonamentul a expirat.");
        }
    }
}
