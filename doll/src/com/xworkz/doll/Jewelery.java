package com.xworkz.doll;

import java.util.ArrayList;
import java.util.Collection;

public class Jewelery {

    public static void main(String[] args) {


        Collection<String> jewelery = new ArrayList<>();

        jewelery.add("Bracelet");
        jewelery.add("Necklace");
        jewelery.add("Earrings");
        jewelery.add("Rings");
        jewelery.add("Anklet");
        jewelery.add("Nose Stud");
        jewelery.add("Bangles");
        jewelery.add("Toe Rings");
        jewelery.add("Pendant");
        jewelery.add("Choker");

        System.out.println("There are the "+jewelery.size()+ " types of jewelery ");

        jewelery.clear();

        System.out.println("There are the "+jewelery.size()+ " types of jewelery after claer");

        jewelery.add("Armlet");
        jewelery.add("Jumka");
        jewelery.add("Haipin");
        jewelery.add("Chain");
        jewelery.add("Waist Belt");
        jewelery.add("Charms");
        jewelery.add("Stud Earrings");
        jewelery.add("Locket Chain");
        jewelery.add("Head Chain");
        jewelery.add("Kada");

        System.out.println("There are the "+jewelery.size()+ " types of jewelery ");
    }
}
