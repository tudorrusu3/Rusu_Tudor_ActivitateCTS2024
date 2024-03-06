package guverneleLumii.main;

import guverneleLumii.model.Guvern;
import guverneleLumii.model.GuvernRegistry;

public class Program {
    public static void main(String[] args) {
        GuvernRegistry guvernRegistry = GuvernRegistry.getInstance();
        guvernRegistry.adaugaGuvern("Romania","Popescu",5);
        guvernRegistry.adaugaGuvern("Romania","Andrei",7);
        guvernRegistry.adaugaGuvern("Ungaria","Ovidiu",10);

        System.out.println(guvernRegistry.getGuvern("Romania"));
        System.out.println(guvernRegistry.getGuvern("Ungaria"));

//        Guvern italia = new Guvern("Romania" , "Franco",19);
//        s a facut constructorul guvernului protected(poate fi accesat doar de clasele ce mostenesc
//        guvernul si cele din acelasi pachet deci nu mai poate fi instaniat aici(pachete dif)
    }
}
