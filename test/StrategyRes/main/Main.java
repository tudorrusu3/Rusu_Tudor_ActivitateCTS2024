package main;

import clase.Card;
import clase.Cash;
import clase.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(15);
        client.plateste();
        client.setModDePlata(new Cash());
        client.plateste();
    }
}
