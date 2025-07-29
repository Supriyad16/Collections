package com.xworkz.nurse;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NurseRunner {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
        if(emf!=null){
            System.out.println("Database Connection");
        }
    }
}
