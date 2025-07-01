package com.xworkz.doll;

import java.util.ArrayList;
import java.util.Collection;

public class Subjects {

    public static void main(String[] args) {

        Collection<String> subject = new ArrayList<>();

        subject.add("English");
        subject.add("Kannada");
        subject.add("Hindi");
        subject.add("Maths");
        subject.add("Science");
        subject.add("Social");
        subject.add("Physics");
        subject.add("Chemistry");
        subject.add("Biology");
        subject.add("Sanskrit");

        System.out.println("The number of subjects are "+subject.size());

        subject.clear();

        System.out.println("The number of subjects after clear are "+subject.size());

        subject.add("Java");
        subject.add("HTML");
        subject.add("CSS");
        subject.add("JavaScript");
        subject.add("Pyhton");
        subject.add("React");
        subject.add("Node");
        subject.add("SQL");
        subject.add("Spring");
        subject.add("Data Science");

        System.out.println("The number of subjects are "+subject.size());


    }

}
