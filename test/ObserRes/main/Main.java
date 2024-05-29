package main;

import observer.Client;
import observer.Observer;
import subiect.Restaurant;
import subiect.Subiect;

public class Main {
    public static void main(String[] args) {
        Observer client1=new Client("Popescu");
        Observer client2=new Client("Manole");

        Subiect restaurant=new Restaurant("PizzaHut");
        restaurant.abonare(client1);
        restaurant.abonare(client2);
        restaurant.notificareMeniuNou();
    }
}
