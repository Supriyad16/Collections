package com.xworkz.box.runner;

import com.xworkz.box.dto.BagDTO;

import java.util.ArrayList;
import java.util.Collection;

public class Bag {

    public static void main(String[] args) {

        Collection<BagDTO> bag = new ArrayList<>();

        bag.add(new BagDTO("WildCraft", "Blue",1500, 6,2,"Laptop"));
        bag.add(new BagDTO("American Tourister","Black",2500,8,3,"Travel"));
        bag.add(new BagDTO("Skybags", "Black", 1200, 4, 1, "Travel"));
        bag.add(new BagDTO("Safari", "Grey", 1600, 3, 2, "Office"));
        bag.add(new BagDTO("Nike", "White", 2000, 2, 1, "Gym"));
        bag.add(new BagDTO("Puma", "Green", 1700, 4, 2, "Laptop"));
        bag.add(new BagDTO("F Gear", "Orange", 1400, 3, 1, "Travel"));
        bag.add(new BagDTO("Tommy Hilfiger", "Navy", 2500, 5, 3, "Office"));
        bag.add(new BagDTO("HRX", "Maroon", 1550, 4, 2, "College"));
        bag.add(new BagDTO("Adidas", "Yellow", 1900, 2, 2, "Gym"));


        System.out.println("The number od Bag type are "+bag.size());


        for(BagDTO bagDTO :bag){

            System.out.println("Brands: "+bagDTO.getBrand());
            System.out.println( " ");
            System.out.println("Colur: "+bagDTO.getColour());
            System.out.println( " ");
            System.out.println("Cost: "+bagDTO.getCost());
            System.out.println( " ");
            System.out.println("Compartments: "+bagDTO.getCompartments());
            System.out.println( " ");
            System.out.println("Warranty: "+bagDTO.getWarranty());
            System.out.println( " ");
            System.out.println("Type: "+bagDTO.getType());
            System.out.println( " ");


        }


    }
}
