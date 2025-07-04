package com.xworkz.table.dto;

public class CarDTO {

        private String brand;
        private String model;
        private String fuelType;
        private double price;
        private boolean automatic;
        private int mileage;
        private String color;
        private int year;
        private int seatingCapacity;
        private boolean sunroof;

        public CarDTO(String brand, String model, String fuelType, double price, boolean automatic,
                      int mileage, String color, int year, int seatingCapacity, boolean sunroof) {
            this.brand = brand;
            this.model = model;
            this.fuelType = fuelType;
            this.price = price;
            this.automatic = automatic;
            this.mileage = mileage;
            this.color = color;
            this.year = year;
            this.seatingCapacity = seatingCapacity;
            this.sunroof = sunroof;
        }


    @Override
    public String toString() {
        return "CarDTO{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", price=" + price +
                ", automatic=" + automatic +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", seatingCapacity=" + seatingCapacity +
                ", sunroof=" + sunroof +
                '}';
    }
}


