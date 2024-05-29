package clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,Flyweight> listaClienti;

    public FlyweightFactory() {
        this.listaClienti =  new HashMap<>();
    }
    public Flyweight getClient(String nume){
        if(!listaClienti.containsKey(nume)){
            listaClienti.put(nume,new Client(nume));
        }
        return listaClienti.get(nume);
    }
}
