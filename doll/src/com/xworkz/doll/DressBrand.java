package com.xworkz.doll;

import java.util.ArrayList;
import java.util.Collection;

public class DressBrand {

    public static void main(String[] args) {

        Collection<String> dressBrand = new ArrayList<>() ;
        dressBrand.add("Zara");
        dressBrand.add("Zudio");
        dressBrand.add("H&M");
        dressBrand.add("Mango");
        dressBrand.add("Mast & Harbour");
        dressBrand.add("Nike");
        dressBrand.add("Adidas");
        dressBrand.add("Calvin Klein");
        dressBrand.add("Chanel");
        dressBrand.add("Gucci");

        System.out.println("The number of Dress Brands are "+dressBrand.size());


        dressBrand.clear();

        System.out.println("The number of Dress Brands are after clear "+dressBrand.size());


        dressBrand.add("Puma");
        dressBrand.add("Pantaloons");
        dressBrand.add("Soch");
        dressBrand.add("Max");
        dressBrand.add("Trends");
        dressBrand.add("Levis");
        dressBrand.add("HRX");
        dressBrand.add("Tommy Hilfiger");
        dressBrand.add("W");
        dressBrand.add("Manyavar");

        System.out.println("The number of Dress Brands are "+dressBrand.size());

    }




}
