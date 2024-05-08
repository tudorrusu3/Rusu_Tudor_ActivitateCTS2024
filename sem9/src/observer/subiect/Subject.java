package observer.subiect;

import observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observers = new ArrayList<>();

    public abstract void anuntaPlecare();
    public void abonareObserver(Observer observer){
        this.observers.add(observer);
    }

    public void dezabonareObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void notificareObservers(String mesaj){
        this.observers.forEach(observer -> {
            observer.primesteMesaj(mesaj);
        });
    }
}
