package com.xworkz.box.runner;

import com.xworkz.box.dto.MovieDTO;

import java.util.ArrayList;
import java.util.Collection;

public class Movie {

    public static void main(String[] args) {


        Collection<MovieDTO> movie = new ArrayList<>();

        movie.add(new MovieDTO("Tourist Family", "Abhishan Jeevinth","Shashi Kumar", "Tamil",2025, 180, 4.9F));
        movie.add(new MovieDTO("UI", "Upendra", "Upendra", "Kannada", 2024, 160, 4.8F));
        movie.add(new MovieDTO("Martin", "AP Arjun", "Dhruva Sarja", "Kannada", 2025, 150, 4.5F));
        movie.add(new MovieDTO("Pushpa", "Sukumar", "Allu Arjun", "Telugu", 2021, 179, 4.7F));
        movie.add(new MovieDTO("Titanic", "James Cameron", "Leonardo DiCaprio", "English", 1997, 195, 4.9F));
        movie.add(new MovieDTO("Appu", "Puri Jagannadh", "Puneeth Rajkumar", "Kannada", 2002, 150, 4.6F));
        movie.add(new MovieDTO("Googly", "Pawan Wadeyar", "Yash", "Kannada", 2013, 138, 4.4F));
        movie.add(new MovieDTO("Leo", "Lokesh Kanagaraj", "Vijay", "Tamil", 2023, 164, 4.5F));
        movie.add(new MovieDTO("Jailer", "Nelson Dilipkumar", "Rajinikanth", "Tamil", 2023, 170, 4.3F));
        movie.add(new MovieDTO("Sanam Teri Kasam", "Radhika Rao", "Harshvardhan Rane", "Hindi", 2016, 154, 4.6F));
        movie.add(new MovieDTO("Jab We Met", "Imtiaz Ali", "Shahid Kapoor", "Hindi", 2007, 138, 4.8F));


        System.out.println("The number of movies are "+movie.size());

        for(MovieDTO movieDTO:movie){

            System.out.println("Title: "+movieDTO.getTitle());
            System.out.println("Director: "+movieDTO.getDirector());
            System.out.println("Hero: "+movieDTO.getHero());
            System.out.println("Language: "+movieDTO.getLanguage());
            System.out.println("Year: "+movieDTO.getYear());
            System.out.println("Duration: "+movieDTO.getDuration());
            System.out.println("Rating: "+movieDTO.getRating());

        }
    }
}
