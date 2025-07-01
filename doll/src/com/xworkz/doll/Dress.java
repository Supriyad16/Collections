package com.xworkz.doll;

import java.util.ArrayList;
import java.util.Collection;

public class Dress {

    public static void main(String[] args) {

        Collection<String> dress = new ArrayList<>();

        dress.add("Jeans");
        dress.add("Shirt");
        dress.add("T-Shirt");
        dress.add("Kurti");
        dress.add("Palazoo");
        dress.add("Sweat Shirt");
        dress.add("Pull Over");
        dress.add("Over Size T-Shirt");
        dress.add("Cargo");
        dress.add("Printed Dress");

        System.out.println("These are "+dress.size()+" types af dress are there");

        dress.clear();

        System.out.println("These are "+dress.size()+" types af dress are there after clear");

        dress.add("Jumpsuit");
        dress.add("Tank top");
        dress.add("Crop Top");
        dress.add("Moms Fit");
        dress.add("Lehenga");
        dress.add("Anarkali");
        dress.add("Sharara");
        dress.add("Mastani");
        dress.add("Gown");
        dress.add("Frock");

        System.out.println("These are "+dress.size()+" types af dress are there");


    }
}
