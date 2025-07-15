package com.xworkz.page.runner;

import com.xworkz.page.dto.BagDTO;

import java.util.HashMap;
import java.util.Map;

    public class Bag {
        public static void main(String[] args) {

            Map<String, BagDTO> bags = new HashMap<>();

            bags.put("Wildcraft", new BagDTO(1, "Wildcraft", "Black", "Backpack", 30, 2500, true, "Polyester", 5, 0.9));
            bags.put("American Tourister", new BagDTO(2, "American Tourister", "Blue", "Trolley", 60, 5500, true, "Polycarbonate", 3, 3.5));
            bags.put("Skybags", new BagDTO(3, "Skybags", "Red", "Laptop Bag", 25, 1800, true, "Nylon", 2, 1.1));
            bags.put("VIP", new BagDTO(4, "VIP", "Grey", "Duffel", 40, 3200, false, "Canvas", 2, 2.0));
            bags.put("F Gear", new BagDTO(5, "F Gear", "Brown", "Sling Bag", 10, 800, false, "Leather", 1, 0.6));
            bags.put("Puma", new BagDTO(6, "Puma", "Black", "Gym Bag", 35, 2200, false, "Polyester", 2, 1.5));
            bags.put("Nike", new BagDTO(7, "Nike", "Green", "Backpack", 28, 2700, true, "Nylon", 3, 1.0));
            bags.put("Safari", new BagDTO(8, "Safari", "Silver", "Trolley", 55, 4900, true, "ABS", 3, 4.2));
            bags.put("Tommy Hilfiger", new BagDTO(9, "Tommy Hilfiger", "Navy", "Shoulder Bag", 20, 3500, false, "Leather", 2, 0.8));
            bags.put("Aristocrat", new BagDTO(10, "Aristocrat", "Orange", "Duffel", 45, 2800, false, "Polyester", 2, 2.3));

            for (Map.Entry<String, BagDTO> entry : bags.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }


