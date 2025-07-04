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

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public int getMileage() {
        return mileage;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public boolean isSunroof() {
        return sunroof;
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


