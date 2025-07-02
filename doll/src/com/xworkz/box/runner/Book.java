package com.xworkz.box.runner;

import com.xworkz.box.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collection;

public class Book {

    public static void main(String[] args) {



        Collection<BookDTO> book = new ArrayList<>();

        book.add(new BookDTO("The Girt in room 105","Chethan Bhagath", "HarperCollins",350,"Mystry",2018 ,"English"));
        book.add(new BookDTO("Verity", "Colleen Hoover", "Grand Central Publishing", 400, "Thriller", 2018,"English"));
        book.add(new BookDTO("I Too Had a Love Story", "Ravinder Singh", "Srishti Publishers", 250, "Romance", 2008,"English"));
        book.add(new BookDTO("Something Happened on the Way to Heaven", "Sudha Murty", "Penguin", 300, "Inspirational", 2014,"English"));
        book.add(new BookDTO("The Silent Patient", "Alex Michaelides", "Orion Publishing", 450, "Psychological Thriller", 2019,"English"));
        book.add(new BookDTO("Murder on the Orient Express", "Agatha Christie", "HarperCollins", 350, "Mystery", 1934,"English"));
        book.add(new BookDTO("One Arranged Murder", "Chetan Bhagat", "Westland", 300, "Mystery", 2020,"English"));
        book.add(new BookDTO("One Indian Girl", "Chetan Bhagat", "Rupa Publications", 280, "Fiction", 2016,"English"));
        book.add(new BookDTO("The Diary of a Young Girl", "Anne Frank", "Penguin", 200, "Autobiography", 1947,"English"));
        book.add(new BookDTO("The Book Thief", "Markus Zusak", "Knopf", 400, "Historical Fiction", 2005,"English"));
        book.add(new BookDTO("A Good Girl’s Guide to Murder", "Holly Jackson", "Egmont", 350, "Mystery", 2019,"English"));


        System.out.println("The number of books are "+book.size());

        for (BookDTO bookDTO :book) {


            System.out.println("Book Title: " +bookDTO.getTitle());
            System.out.println("Author: "+bookDTO.getAuthor());
            System.out.println("Publisher: "+bookDTO.getPublisher());
            System.out.println("Price: "+bookDTO.getPrice());
            System.out.println("Genre: "+bookDTO.getGenre());
            System.out.println("Publisher Year: "+bookDTO.getYear());
            System.out.println("Language: "+bookDTO.getLanguage());

        }
    }
}
