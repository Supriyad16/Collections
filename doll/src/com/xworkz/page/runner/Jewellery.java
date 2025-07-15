package com.xworkz.page.runner;

import com.xworkz.page.dto.JewelleryDTO;

import java.util.HashMap;
import java.util.Map;

public class Jewellery {
    public static void main(String[] args) {

        Map<String, JewelleryDTO> jewel = new HashMap<>();

        jewel.put("Chain",new JewelleryDTO(001,"Chain", "Gold",8,45000,22, "Kalyan",true,"None",250));
        jewel.put("Ring", new JewelleryDTO(002, "Ring", "Platinum", 5, 60000, 95, "Malabar", true, "Diamond", 500));
        jewel.put("Bangle", new JewelleryDTO(003, "Bangle", "Gold", 15, 85000, 22, "Tanishq", true, "Ruby", 700));
        jewel.put("Necklace", new JewelleryDTO(004, "Necklace", "Gold", 25, 120000, 22, "PC Jeweller", true, "Emerald", 1200));
        jewel.put("Bracelet", new JewelleryDTO(005, "Bracelet", "Silver", 12, 15000, 92, "Joyalukkas", false, "None", 200));
        jewel.put("Earring", new JewelleryDTO(006, "Earring", "Gold", 6, 35000, 18, "Kalyan", true, "Diamond", 400));
        jewel.put("Pendant", new JewelleryDTO(007, "Pendant", "Gold", 4, 18000, 22, "Malabar", true, "Sapphire", 150));
        jewel.put("Anklet", new JewelleryDTO(8, "Anklet", "Silver", 10, 8000, 92, "Senco", false, "None", 100));
        jewel.put("Nose Ring", new JewelleryDTO(9, "Nose Ring", "Gold", 2, 9500, 22, "Tanishq", true, "None", 80));
        jewel.put("Toe Ring", new JewelleryDTO(010, "Toe Ring", "Silver", 3, 3000, 92, "Kalyan", false, "None", 50));


        for(Map.Entry<String, JewelleryDTO> map : jewel.entrySet()){
            System.out.println(map.getKey()+ " -> "+map.getValue() );
        }
    }
}
