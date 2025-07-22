package com.xworkz.hat.runner;

import com.xworkz.hat.dto.SportsDTO;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.out;

public class SportsRunner {
    public static void main(String[] args) {

        Comparator<SportsDTO> playerCountComparator = Comparator.comparingInt(SportsDTO::getNoOfPlayers);
        Comparator<SportsDTO> nameComparator = Comparator.comparing(SportsDTO::getName);
        Comparator<SportsDTO> typeComparator = Comparator.comparing(SportsDTO::getType);
        Comparator<SportsDTO> originComparator = Comparator.comparing(SportsDTO::getOriginCountry);
        Comparator<SportsDTO> nameThenCountry = Comparator.comparing(SportsDTO::getName)
                .thenComparing(SportsDTO::getOriginCountry);
        Comparator<SportsDTO> dateComparator = Comparator.comparing(SportsDTO::getLocalDateTime);


        SportsDTO s1 = new SportsDTO("Cricket", 11, "Outdoor", "Bat & Ball", "England", LocalDateTime.of(2025, 1, 5, 10, 0));
        SportsDTO s2 = new SportsDTO("Football", 11, "Outdoor", "Football", "England", LocalDateTime.of(2025, 2, 1, 11, 30));
        SportsDTO s3 = new SportsDTO("Hockey", 11, "Outdoor", "Stick & Ball", "India", LocalDateTime.of(2025, 2, 15, 14, 0));
        SportsDTO s4 = new SportsDTO("Tennis", 2, "Outdoor", "Racket & Ball", "France", LocalDateTime.of(2025, 3, 1, 9, 45));
        SportsDTO s5 = new SportsDTO("Badminton", 2, "Indoor", "Racket & Shuttle", "India", LocalDateTime.of(2025, 3, 10, 16, 30));
        SportsDTO s6 = new SportsDTO("Basketball", 5, "Indoor", "Basketball", "USA", LocalDateTime.of(2025, 3, 20, 12, 15));
        SportsDTO s7 = new SportsDTO("Baseball", 9, "Outdoor", "Bat & Ball", "USA", LocalDateTime.of(2025, 4, 5, 13, 0));
        SportsDTO s8 = new SportsDTO("Rugby", 15, "Outdoor", "Rugby Ball", "England", LocalDateTime.of(2025, 4, 15, 15, 10));
        SportsDTO s9 = new SportsDTO("Volleyball", 6, "Outdoor", "Volleyball", "USA", LocalDateTime.of(2025, 5, 1, 10, 20));
        SportsDTO s10 = new SportsDTO("Table Tennis", 2, "Indoor", "Table & Paddle", "England", LocalDateTime.of(2025, 5, 5, 18, 0));
        SportsDTO s11 = new SportsDTO("Golf", 1, "Outdoor", "Golf Club", "Scotland", LocalDateTime.of(2025, 5, 20, 9, 30));
        SportsDTO s12 = new SportsDTO("Kabaddi", 7, "Outdoor", "None", "India", LocalDateTime.of(2025, 6, 1, 17, 0));
        SportsDTO s13 = new SportsDTO("Wrestling", 1, "Indoor", "Mat", "Greece", LocalDateTime.of(2025, 6, 10, 11, 0));
        SportsDTO s14 = new SportsDTO("Swimming", 1, "Outdoor", "Swimsuit", "Australia", LocalDateTime.of(2025, 6, 20, 14, 45));
        SportsDTO s15 = new SportsDTO("Boxing", 1, "Indoor", "Gloves", "USA", LocalDateTime.of(2025, 7, 1, 12, 0));
        SportsDTO s16 = new SportsDTO("Archery", 1, "Outdoor", "Bow & Arrow", "Korea", LocalDateTime.of(2025, 7, 5, 13, 15));
        SportsDTO s17 = new SportsDTO("Skating", 1, "Outdoor", "Skates", "Netherlands", LocalDateTime.of(2025, 7, 15, 16, 30));
        SportsDTO s18 = new SportsDTO("Surfing", 1, "Outdoor", "Surfboard", "Hawaii", LocalDateTime.of(2025, 7, 25, 10, 50));
        SportsDTO s19 = new SportsDTO("Karate", 1, "Indoor", "Gi Uniform", "Japan", LocalDateTime.of(2025, 8, 1, 11, 40));
        SportsDTO s20 = new SportsDTO("Snowboarding", 1, "Outdoor", "Snowboard", "Canada", LocalDateTime.of(2025, 8, 10, 15, 0));

        List<SportsDTO> sportsList = Stream.of(
                s1, s2, s3, s4, s5,
                s6, s7, s8, s9, s10,
                s11, s12, s13, s14, s15,
                s16, s17, s18, s19, s20
        ).collect(Collectors.toList());


        System.out.println("1. Sort by Number of Players:");
        sportsList.stream().sorted(playerCountComparator).forEach(System.out::println);

        System.out.println("2. Sort by Sport Name:");
        sportsList.stream().sorted(nameComparator).forEach(System.out::println);

        System.out.println("3. Sort by Type (Indoor/Outdoor):");
        sportsList.stream().sorted(typeComparator).forEach(System.out::println);

        System.out.println("4. Sort by Origin Country:");
        sportsList.stream().sorted(originComparator).forEach(System.out::println);

        System.out.println("5. Sort by Name then Country:");
        sportsList.stream().sorted(nameThenCountry).forEach(System.out::println);

        System.out.println("6. Sort by Date:");
        sportsList.stream().sorted(dateComparator).forEach(System.out::println);

        System.out.println("7. Filter: Outdoor Sports Only:");
        sportsList.stream()
                .filter(s -> s.getType().equalsIgnoreCase("Outdoor"))
                .forEach(System.out::println);

        System.out.println("8. Filter: Sports with > 5 Players:");
        sportsList.stream()
                .filter(s -> s.getNoOfPlayers() > 5)
                .forEach(System.out::println);

        System.out.println("9. Filter: Origin Country = India:");
        sportsList.stream()
                .filter(s -> s.getOriginCountry().equalsIgnoreCase("India"))
                .forEach(System.out::println);
    }
}
