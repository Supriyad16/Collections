package com.xworkz.page.dto;

public class BagDTO {

        private int bagId;
        private String brand;
        private String color;
        private String type;
        private int capacity;
        private int price;
        private boolean waterproof;
        private String material;
        private int warranty; // in years
        private double weight;

        public BagDTO(int bagId, String brand, String color, String type, int capacity, int price,
                      boolean waterproof, String material, int warranty, double weight) {
            this.bagId = bagId;
            this.brand = brand;
            this.color = color;
            this.type = type;
            this.capacity = capacity;
            this.price = price;
            this.waterproof = waterproof;
            this.material = material;
            this.warranty = warranty;
            this.weight = weight;
        }

    public int getBagId() {
        return bagId;
    }

    public void setBagId(int bagId) {
        this.bagId = bagId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
        public String toString() {
            return "BagDTO{" +
                    "bagId=" + bagId +
                    ", brand='" + brand + '\'' +
                    ", color='" + color + '\'' +
                    ", type='" + type + '\'' +
                    ", capacity=" + capacity +
                    ", price=" + price +
                    ", waterproof=" + waterproof +
                    ", material='" + material + '\'' +
                    ", warranty=" + warranty +
                    ", weight=" + weight +
                    '}';
        }
    }


