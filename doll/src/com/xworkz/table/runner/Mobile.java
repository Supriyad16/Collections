package com.xworkz.table.runner;

import com.xworkz.table.dto.MobileDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Mobile {

        public static void main(String[] args) {
            Collection<MobileDTO> mobiles = new ArrayList<>();

            mobiles.add(new MobileDTO("Samsung", "Galaxy S23", 74999.0, 8, 128, "Snapdragon 8 Gen 2", true, 4700, "Phantom Black", 2023));
            mobiles.add(new MobileDTO("Apple", "iPhone 14", 79999.0, 6, 128, "A15 Bionic", true, 3279, "Blue", 2022));
            mobiles.add(new MobileDTO("OnePlus", "11R", 39999.0, 8, 256, "Snapdragon 8+ Gen 1", true, 5000, "Silver", 2023));
            mobiles.add(new MobileDTO("Xiaomi", "Mi 11X", 29999.0, 6, 128, "Snapdragon 870", true, 4520, "Celestial Silver", 2021));
            mobiles.add(new MobileDTO("Realme", "GT Neo 3", 36999.0, 8, 256, "Dimensity 8100", true, 5000, "Black", 2022));
            mobiles.add(new MobileDTO("Vivo", "V27 Pro", 37999.0, 8, 128, "Dimensity 8200", true, 4600, "Magic Blue", 2023));
            mobiles.add(new MobileDTO("iQOO", "Z7", 18999.0, 6, 128, "Dimensity 920", true, 4500, "Norway Blue", 2023));
            mobiles.add(new MobileDTO("Motorola", "Edge 30", 27999.0, 8, 128, "Snapdragon 778G+", true, 4020, "Meteor Grey", 2022));
            mobiles.add(new MobileDTO("Asus", "ROG Phone 6", 71999.0, 12, 256, "Snapdragon 8+ Gen 1", true, 6000, "Black", 2022));
            mobiles.add(new MobileDTO("Nothing", "Phone (1)", 32999.0, 8, 128, "Snapdragon 778G+", true, 4500, "White", 2022));

            Iterator<MobileDTO> iterator = mobiles.iterator();
            while (iterator.hasNext()) {
                MobileDTO mobileDTO = iterator.next();
                System.out.println(mobileDTO);
            }
        }
    }




