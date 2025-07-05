package com.xworkz.table.dto;

public class MobileDTO {

        private String brand;
        private String model;
        private double price;
        private int ram;
        private int storage;
        private String processor;
        private boolean fiveG;
        private int battery;
        private String color;
        private int year;

        public MobileDTO(String brand, String model, double price, int ram, int storage, String processor, boolean fiveG, int battery, String color, int year) {
            this.brand = brand;
            this.model = model;
            this.price = price;
            this.ram = ram;
            this.storage = storage;
            this.processor = processor;
            this.fiveG = fiveG;
            this.battery = battery;
            this.color = color;
            this.year = year;
        }

        @Override
        public String toString() {
            return "MobileDTO{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", price=" + price +
                    ", ram=" + ram +
                    "GB, storage=" + storage +
                    "GB, processor='" + processor + '\'' +
                    ", fiveG=" + fiveG +
                    ", battery=" + battery +
                    "mAh, color='" + color + '\'' +
                    ", year=" + year +
                    '}';
        }
    }


