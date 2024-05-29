package subiect;

public class Restaurant extends Subiect{
    String denumire;

    public Restaurant(String denumire) {
        this.denumire = denumire;
    }
    @Override
    public void notificareModificarePret() {
        super.notificaTotiClientii("O noua ofera de pret a aparut in cadrul restaurantului " +denumire);
    }

    @Override
    public void notificareMeniuNou() {
        super.notificaTotiClientii("Un nou meniu a aparut in cadrul restaurantului "+denumire);
    }
}
