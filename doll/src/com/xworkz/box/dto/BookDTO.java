package com.xworkz.box.dto;

public class BookDTO {

    private String title;
    private  String author;
    private String publisher;
    private int price;
    private String genre;
    private int year;
    private String language;

    public BookDTO(String title, String author, String publisher, int price, String genre, int year, String language) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.genre = genre;
        this.year = year;
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPrice() {
        return price;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public String getLanguage() {
        return language;
    }
}
