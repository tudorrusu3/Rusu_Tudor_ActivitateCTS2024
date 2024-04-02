package ex4.main;

import ex4.metrou.BiletMetrou;
import ex4.metrou.Calatorie;
import ex4.suprateran.AdapterCalatorie;
import ex4.suprateran.CardSTB;

public class Main {
    public static void validareIntrareMetrou(Calatorie calatorie){
        if(calatorie.estePermisAccesul()){
            System.out.println("Calatorie placuta!");
        }else{
            System.out.println("Sold calatorii insuficient.");
        }
    }
    public static void validareUrcareSTB(CardSTB card){
        card.validareCalatorie();
    }
    public static void main(String[] args) {
        Calatorie biletMetrou=new BiletMetrou("Rares",3);
        validareIntrareMetrou(biletMetrou);

        CardSTB biletMixt=new AdapterCalatorie(biletMetrou);
        validareUrcareSTB(biletMixt);
        validareIntrareMetrou(biletMetrou);
    }
}