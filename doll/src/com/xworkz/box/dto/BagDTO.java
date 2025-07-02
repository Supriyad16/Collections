package com.xworkz.box.dto;

public class BagDTO {

    private String brand;
    private String colour;
    private int cost;
    private int compartments;
    private int warranty;
    private String type;


    public BagDTO(String brand, String colour, int cost, int compartments, int warranty, String type) {
        this.brand = brand;
        this.colour = colour;
        this.cost = cost;
        this.compartments = compartments;
        this.warranty = warranty;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public int getCost() {
        return cost;
    }


    public int getCompartments() {
        return compartments;
    }

    public int getWarranty() {
        return warranty;
    }

    public String getType() {
        return type;
    }



}
