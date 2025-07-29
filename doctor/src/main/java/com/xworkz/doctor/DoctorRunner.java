package com.xworkz.doctor;

import com.sun.org.apache.xerces.internal.impl.XMLEntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DoctorRunner {

    public static void main(String[] args) {

         EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");

         if(emf!=null){
             System.out.println("Database Connection");
         }
    }
}
