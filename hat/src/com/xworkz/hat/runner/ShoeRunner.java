package com.xworkz.hat.runner;


import com.xworkz.hat.dto.ShoeDTO;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.out;

public class ShoeRunner {
    public static void main(String[] args) {

        // Comparators
        Comparator<ShoeDTO> priceComparator = Comparator.comparingDouble(ShoeDTO::getPrice);
        Comparator<ShoeDTO> ascendingPrice = Comparator.comparingDouble(ShoeDTO::getPrice);
        Comparator<ShoeDTO> descendingPrice = (o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice());
        Comparator<ShoeDTO> brandComparator = Comparator.comparing(ShoeDTO::getBrand);
        Comparator<ShoeDTO> colorComparator = Comparator.comparing(ShoeDTO::getColour)
                .thenComparing(ShoeDTO::getBrand);

        // 20 ShoeDTO Objects
        ShoeDTO shoe1 = new ShoeDTO("Nike", "White", 4, 8000, "Leather");
        ShoeDTO shoe2 = new ShoeDTO("Adidas", "Black", 7, 7500, "Mesh");
        ShoeDTO shoe3 = new ShoeDTO("Puma", "Blue", 8, 6800, "Synthetic");
        ShoeDTO shoe4 = new ShoeDTO("Reebok", "Red", 9, 7200, "Leather");
        ShoeDTO shoe5 = new ShoeDTO("Skechers", "Grey", 6, 6500, "Fabric");
        ShoeDTO shoe6 = new ShoeDTO("Fila", "White", 8, 5600, "Synthetic");
        ShoeDTO shoe7 = new ShoeDTO("Woodland", "Brown", 9, 8500, "Leather");
        ShoeDTO shoe8 = new ShoeDTO("Bata", "Black", 7, 3000, "Canvas");
        ShoeDTO shoe9 = new ShoeDTO("Jordan", "White", 10, 12000, "Leather");
        ShoeDTO shoe10 = new ShoeDTO("Converse", "Red", 6, 5000, "Canvas");
        ShoeDTO shoe11 = new ShoeDTO("Under Armour", "Blue", 9, 8900, "Synthetic");
        ShoeDTO shoe12 = new ShoeDTO("Vans", "Black", 8, 4000, "Canvas");
        ShoeDTO shoe13 = new ShoeDTO("New Balance", "Green", 7, 7000, "Mesh");
        ShoeDTO shoe14 = new ShoeDTO("Asics", "White", 9, 8200, "Synthetic");
        ShoeDTO shoe15 = new ShoeDTO("Lee Cooper", "Brown", 8, 4500, "Leather");
        ShoeDTO shoe16 = new ShoeDTO("Clarks", "Beige", 10, 9000, "Leather");
        ShoeDTO shoe17 = new ShoeDTO("Liberty", "Blue", 6, 3500, "Synthetic");
        ShoeDTO shoe18 = new ShoeDTO("Sparx", "Yellow", 7, 2500, "Canvas");
        ShoeDTO shoe19 = new ShoeDTO("HRX", "Black", 9, 5500, "Mesh");
        ShoeDTO shoe20 = new ShoeDTO("Campus", "White", 8, 2000, "Synthetic");

        List<ShoeDTO> shoeList = Stream.of(
                shoe1, shoe2, shoe3, shoe4, shoe5,
                shoe6, shoe7, shoe8, shoe9, shoe10,
                shoe11, shoe12, shoe13, shoe14, shoe15,
                shoe16, shoe17, shoe18, shoe19, shoe20
        ).collect(Collectors.toList());


        System.out.println("1. Sort by Price (Ascending):");
        shoeList.stream().sorted(priceComparator).forEach(System.out::println);

        System.out.println("2. Price Ascending:");
        shoeList.stream().sorted(ascendingPrice).forEach(System.out::println);

        System.out.println("3. Price Descending:");
        shoeList.stream().sorted(descendingPrice).forEach(System.out::println);

        System.out.println("4. Sort by Brand:");
        shoeList.stream().sorted(brandComparator).forEach(System.out::println);

        System.out.println("5. Sort by Color then Brand:");
        shoeList.stream().sorted(colorComparator).forEach(System.out::println);

        System.out.println("6. Filter by Price > 5000 and Sort Descending:");
        shoeList.stream()
                .filter(s -> s.getPrice() > 5000)
                .sorted(descendingPrice)
                .forEach(System.out::println);

        System.out.println("7. Filter by Leather Material:");
        shoeList.stream()
                .filter(s -> s.getMaterial().equalsIgnoreCase("Leather"))
                .forEach(System.out::println);
    }
}


