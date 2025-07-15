package com.xworkz.page.dto;

public class JewelleryDTO {

    private int jId;
    private String name;
    private String material;
    private int weight;
    private int price;
    private int purity;
    private String brand;
    private boolean hallmark;
    private String stoneType;
    private int makingCharges;

    public JewelleryDTO(int jId, String name, String material, int weight, int price, int purity, String brand, boolean hallmark, String stoneType, int makingCharges) {
        this.jId = jId;
        this.name = name;
        this.material = material;
        this.weight = weight;
        this.price = price;
        this.purity = purity;
        this.brand = brand;
        this.hallmark = hallmark;
        this.stoneType = stoneType;
        this.makingCharges = makingCharges;
    }

    public int getjId() {
        return jId;
    }

    public void setjId(int jId) {
        this.jId = jId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPurity() {
        return purity;
    }

    public void setPurity(int purity) {
        this.purity = purity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean getHallmark() {
        return hallmark;
    }

    public void setHallmark(boolean hallmark) {
        this.hallmark = hallmark;
    }

    public String getStoneType() {
        return stoneType;
    }

    public void setStoneType(String stoneType) {
        this.stoneType = stoneType;
    }

    public int getMakingCharges() {
        return makingCharges;
    }

    public void setMakingCharges(int makingCharges) {
        this.makingCharges = makingCharges;
    }

    @Override
    public String toString() {
        return "JewelleryDTO{" +
                "jId=" + jId +
                ", name='" + name + '\'' +
                ", material='" + material + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", purity=" + purity +
                ", brand='" + brand + '\'' +
                ", hallmark='" + hallmark + '\'' +
                ", stoneType='" + stoneType + '\'' +
                ", makingCharges='" + makingCharges + '\'' +
                '}';
    }
}
