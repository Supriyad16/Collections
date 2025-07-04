package com.xworkz.table.runner;

import com.xworkz.table.dto.StudentDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Student {


        public static void main(String[] args) {
            Collection<StudentDTO> students = new ArrayList<>();

            students.add(new StudentDTO("Aarav", 20, "B.Tech", "NITK", 89.5, true, "Bangalore", 2, "9876543210", true));
            students.add(new StudentDTO("Meera", 21, "BCA", "Christ", 92.0, false, "Mysore", 3, "9876501234", false));
            students.add(new StudentDTO("Rahul", 22, "MBA", "IIMB", 85.3, true, "Hyderabad", 1, "9845612345", true));
            students.add(new StudentDTO("Divya", 20, "BSc", "Mount Carmel", 88.0, false, "Chennai", 2, "9887766554", false));
            students.add(new StudentDTO("Ravi", 23, "M.Tech", "IITD", 90.0, true, "Delhi", 2, "9867345678", true));
            students.add(new StudentDTO("Sneha", 19, "BCom", "Jain", 75.0, false, "Bangalore", 1, "9898978978", false));
            students.add(new StudentDTO("Arjun", 21, "BE", "RVCE", 78.9, false, "Tumkur", 4, "9874563210", true));
            students.add(new StudentDTO("Neha", 22, "BBA", "PES", 81.2, true, "Hubli", 3, "9765432198", false));
            students.add(new StudentDTO("Vikram", 20, "BA", "St. Joseph's", 84.1, true, "Belgaum", 2, "9654321876", true));
            students.add(new StudentDTO("Kavya", 21, "B.Tech", "MIT", 87.5, false, "Manipal", 4, "9543217689", false));

            Iterator<StudentDTO> iterator = students.iterator();
            while (iterator.hasNext()) {
                StudentDTO studentDTO = iterator.next();
                System.out.println(studentDTO);
            }
        }
    }


