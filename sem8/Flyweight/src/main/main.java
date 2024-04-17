package main;

import clase.FlyweightFactory;
import clase.Flyweight;
import clase.Reteta;

public class main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Reteta reteta1 = new Reteta("reteta1",150d,4);
        Reteta reteta2 = new Reteta("reteta2",110d,3);
        Reteta reteta3 = new Reteta("reteta3",120d,5);
        Reteta reteta4 = new Reteta("reteta4",130d,4);

        Flyweight client = factory.getClient("1234567","Gigel");
        client.achizitieReteta(reteta1);

        factory.getClient("1234567","Gigel").achizitieReteta(reteta2);

        factory.getClient("8765421","Ionel").achizitieReteta(reteta3);
        factory.getClient("8765421","Ionel").achizitieReteta(reteta4);


    }
}