package com.xworkz.streams.runner;

import com.xworkz.streams.dto.DressDTO;

import java.util.*;
import java.util.stream.Collectors;

public class Dress {

    public static void main(String[] args) {

        List<DressDTO> dressDTOS = new ArrayList<>();

        dressDTOS.add(new DressDTO("shirt", "cotton", 350));
        dressDTOS.add(new DressDTO("t-shirt", "polyester", 250));
        dressDTOS.add(new DressDTO("jeans", "denim", 900));
        dressDTOS.add(new DressDTO("jacket", "leather", 2500));
        dressDTOS.add(new DressDTO("skirt", "silk", 750));
        dressDTOS.add(new DressDTO("trousers", "linen", 650));
        dressDTOS.add(new DressDTO("kurta", "cotton", 500));
        dressDTOS.add(new DressDTO("saree", "chiffon", 1500));
        dressDTOS.add(new DressDTO("hoodie", "fleece", 1200));
        dressDTOS.add(new DressDTO("shorts", "nylon", 300));


        dressDTOS.stream().filter(e -> e.getMaterial().equalsIgnoreCase("leather")).forEach(n-> System.out.println(n));
        System.out.println("---- *** ----");
        dressDTOS.stream().filter(n->n.getType().startsWith("h")).forEach(p-> System.out.println(p));
        System.out.println("---- *** ----");
        dressDTOS.stream().filter(p->p.getMaterial().toUpperCase().startsWith("p")).forEach( System.out::println);
        System.out.println("---- *** ----");
        dressDTOS.stream().filter((p)->p.getType().endsWith("t")).forEach(e-> System.out.println(e));
        System.out.println("---- *** ----");
//        dressDTOS
//                .stream()
//                .filter((p)->!p.toLowerCase().startsWith("f"))
//                .sorted(Comparator.reverseOrder())
//                .forEach(e-> System.out.println(e));

        Collections.reverse(dressDTOS);
        dressDTOS.forEach(n-> System.out.println(n));

    }



}
