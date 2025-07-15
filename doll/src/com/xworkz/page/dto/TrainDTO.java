package com.xworkz.page.dto;

public class TrainDTO {

        private int trainNumber;
        private String name;
        private String source;
        private String destination;
        private String type;
        private int numberOfCoaches;
        private int capacity;
        private boolean pantryAvailable;
        private String operator;
        private double fare;

        public TrainDTO(int trainNumber, String name, String source, String destination, String type,
                        int numberOfCoaches, int capacity, boolean pantryAvailable, String operator, double fare) {
            this.trainNumber = trainNumber;
            this.name = name;
            this.source = source;
            this.destination = destination;
            this.type = type;
            this.numberOfCoaches = numberOfCoaches;
            this.capacity = capacity;
            this.pantryAvailable = pantryAvailable;
            this.operator = operator;
            this.fare = fare;
        }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfCoaches() {
        return numberOfCoaches;
    }

    public void setNumberOfCoaches(int numberOfCoaches) {
        this.numberOfCoaches = numberOfCoaches;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isPantryAvailable() {
        return pantryAvailable;
    }

    public void setPantryAvailable(boolean pantryAvailable) {
        this.pantryAvailable = pantryAvailable;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    @Override
        public String toString() {
            return "TrainDTO{" +
                    "trainNumber=" + trainNumber +
                    ", name='" + name + '\'' +
                    ", source='" + source + '\'' +
                    ", destination='" + destination + '\'' +
                    ", type='" + type + '\'' +
                    ", numberOfCoaches=" + numberOfCoaches +
                    ", capacity=" + capacity +
                    ", pantryAvailable=" + pantryAvailable +
                    ", operator='" + operator + '\'' +
                    ", fare=" + fare +
                    '}';
        }
    }


