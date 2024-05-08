package observer.main;

import observer.observer.Client;
import observer.subiect.Autobuz;
import observer.subiect.Subject;
import observer.subiect.Tramvai;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Sandu");
        Client client2 = new Client("Rares");
        Tramvai tramvai = new Tramvai(41);
        tramvai.abonareObserver(client);
        tramvai.abonareObserver(client2);
        tramvai.anuntaPlecare();
        tramvai.dezabonareObserver(client);
        Client client3 = new Client("Tudor");
        tramvai.abonareObserver(client3);
        tramvai.anuntaPlecare();

        Subject autobuz = new Autobuz();
        autobuz.abonareObserver(client);
        autobuz.abonareObserver(client3);
        autobuz.anuntaPlecare();
        ((Autobuz) autobuz).anuntaDeviereTraseu();
    }
}
