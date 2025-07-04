package com.xworkz.table.runner;

import com.xworkz.table.dto.CarDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Car {

        public static void main(String[] args) {


            Collection<CarDTO> cars = new ArrayList<>();

            cars.add(new CarDTO("Hyundai", "Creta", "Petrol", 1200000, true, 18, "White", 2022, 5, true));
            cars.add(new CarDTO("Tata", "Nexon", "Diesel", 1100000, false, 21, "Blue", 2021, 5, false));
            cars.add(new CarDTO("Toyota", "Innova", "Petrol", 1800000, true, 15, "Silver", 2023, 7, true));
            cars.add(new CarDTO("Honda", "City", "Petrol", 1300000, true, 17, "Red", 2022, 5, true));
            cars.add(new CarDTO("Maruti", "Swift", "Petrol", 850000, false, 22, "White", 2020, 5, false));
            cars.add(new CarDTO("Kia", "Seltos", "Diesel", 1400000, true, 20, "Grey", 2023, 5, true));
            cars.add(new CarDTO("MG", "Hector", "Petrol", 1600000, true, 14, "Black", 2023, 5, true));
            cars.add(new CarDTO("Skoda", "Slavia", "Petrol", 1350000, true, 16, "Blue", 2022, 5, false));
            cars.add(new CarDTO("Ford", "Ecosport", "Diesel", 1000000, false, 19, "Brown", 2021, 5, false));
            cars.add(new CarDTO("Mahindra", "XUV700", "Diesel", 2000000, true, 15, "Silver", 2023, 7, true));

            Iterator<CarDTO> iterator = cars.iterator();
            while (iterator.hasNext()) {

                while (iterator.hasNext()) {
                    CarDTO carDTO = iterator.next();
                    System.out.println(carDTO);

                }
            }
        }
    }

