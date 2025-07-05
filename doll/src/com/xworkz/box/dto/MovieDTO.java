package com.xworkz.box.dto;

public class MovieDTO {

    private String title;
    private String director;
    private String hero;
    private String language;
    private int year;
    private int duration;
    private float rating;


    public MovieDTO(String title, String director, String hero, String language, int year, int duration, float rating) {
        this.title = title;
        this.director = director;
        this.hero = hero;
        this.language = language;
        this.year = year;
        this.duration = duration;
        this.rating = rating;
    }


    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getHero() {
        return hero;
    }

    public String getLanguage() {
        return language;
    }

    public int getYear() {
        return year;
    }

    public int getDuration() {
        return duration;
    }

    public float getRating() {
        return rating;
    }

}
