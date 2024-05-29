package subiect;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    private List<Observer> observers;

    public Subiect() {
        this.observers = new ArrayList<>();
    }
    public void abonare(Observer client){
        observers.add(client);
    }
    public void dezabonare(Observer client){
        observers.remove(client);
    }
    public void notificaTotiClientii(String mesaj){
        for (Observer observer: observers) {
            observer.primesteMesaj(mesaj);
        }
    }
    public abstract void notificareModificarePret();
    public abstract void notificareMeniuNou();

}
