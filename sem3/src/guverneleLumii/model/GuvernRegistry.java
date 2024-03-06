package guverneleLumii.model;

import java.util.HashMap;
import java.util.Map;

public class GuvernRegistry {
    private Map<String,Guvern> guverneleLumii;
    private static GuvernRegistry instanta = null;
    private GuvernRegistry(){
        this.guverneleLumii = new HashMap<>();
    }
    public synchronized static GuvernRegistry getInstance(){
        if(instanta == null){
            instanta = new GuvernRegistry();
        }
        return instanta;
    }
    public void adaugaGuvern(String numeTara, String numePrimMinistru, int nrGuvernatori){
        if(!this.guverneleLumii.containsKey(numeTara)){
            this.guverneleLumii.put(numeTara,new Guvern(numeTara,numePrimMinistru,nrGuvernatori));
        }
    }
    public Guvern getGuvern(String numeTara){
        return this.guverneleLumii.get(numeTara);
    }
}
