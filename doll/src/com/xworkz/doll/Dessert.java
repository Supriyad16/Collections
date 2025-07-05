package com.xworkz.doll;

import java.util.ArrayList;
import java.util.Collection;

public class Dessert {

    public static void main(String[] args) {

        Collection<String> dessert = new ArrayList<>() ;

        dessert.add("Chocolate Brownie");
        dessert.add("Ice Cream");
        dessert.add("Tiramisu");
        dessert.add("Cookies");
        dessert.add("Cakes");
        dessert.add("Pudding");
        dessert.add("Pastry");
        dessert.add("Doughnut");
        dessert.add("Gulab Jamoon");
        dessert.add("Kheer");

        System.out.println("The number of Desserts in the list are "+dessert.size());

        dessert.clear();

        System.out.println("The number of Desserts in the list After the clear "+dessert.size());

        dessert.add("Kulfi");
        dessert.add("Croissant");
        dessert.add("Apple Pie");
        dessert.add("Peda");
        dessert.add("Barfi");
        dessert.add("Swiss Roll");
        dessert.add("Macaroon");
        dessert.add("Waffles");
        dessert.add("Muffins");
        dessert.add("Kunafa");

        System.out.println("The number of Desserts in the list are "+dessert.size());

        }
    }


