package main;

import clase.FacadeRestaurant;
import clase.Receptionist;

public class Main {
    public static void main(String[] args) {
        Receptionist receptionist = new Receptionist();
        FacadeRestaurant facade=new FacadeRestaurant(receptionist);
        facade.verificaTot();
    }
}
