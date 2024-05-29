package clase;

public class FacadeRestaurant {
    Receptionist receptionist;

    public FacadeRestaurant(Receptionist receptionist) {
        this.receptionist = receptionist;
    }
    public void verificaTot(){
        if(this.receptionist.eMasaLibera()){
            this.receptionist.verifcaDebarasare();
            this.receptionist.verificaServetele();
        }else{
            System.out.println("Nu este nicio masa disponibila.");
        }
    }
}
