package com.xworkz.Map;

import java.util.HashMap;
import java.util.Map;

public class Cartoon {

    public static void main(String[] args) {
        Map<String, String> cartoon = new HashMap<>();

        cartoon.put("Dora","Boots");
        cartoon.put("Bheem","Chutki");
        cartoon.put("Doremon", "Nobita");
        cartoon.put("Shinchan","Shiro");
        cartoon.put("Oggy", "Jack");
        cartoon.put("Tom","Jerry");
        cartoon.put("Mr.Bean","Teddy");
        cartoon.put("Peppa Pig","Rabbit");
        cartoon.put("Masha","Bear");
        cartoon.put("Motu","Patlu");

        System.out.println(cartoon.get("Dora"));

        System.out.println(cartoon);

//        for(Map.Entry<String,String> entry:cartoon.entrySet()){
//            System.out.println(entry.getKey()+" -> " +entry.getValue());
//        }

//        cartoon.forEach((S,F)->(Sout))

        }
}



