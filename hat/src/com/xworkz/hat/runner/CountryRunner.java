package com.xworkz.hat.runner;

import com.xworkz.hat.dto.CountryDTO;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.out;

public class CountryRunner {
    public static void main(String[] args) {


        Comparator<CountryDTO> populationComparator = Comparator.comparingInt(CountryDTO::getPolulationInMillion);
        Comparator<CountryDTO> stateCountComparator = Comparator.comparingInt(CountryDTO::getNoOfStates);
        Comparator<CountryDTO> nameComparator = Comparator.comparing(CountryDTO::getName);
        Comparator<CountryDTO> continentComparator = Comparator.comparing(CountryDTO::getContinent);
        Comparator<CountryDTO> presidentNameComparator = Comparator.comparing(CountryDTO::getPresidentName);
        Comparator<CountryDTO> continentThenPresident = Comparator.comparing(CountryDTO::getContinent)
                .thenComparing(CountryDTO::getPresidentName);


        CountryDTO c1 = new CountryDTO("India", "Asia", 28, "Droupadi Murmu", 1420);
        CountryDTO c2 = new CountryDTO("USA", "North America", 50, "Joe Biden", 331);
        CountryDTO c3 = new CountryDTO("Germany", "Europe", 16, "Frank-Walter Steinmeier", 83);
        CountryDTO c4 = new CountryDTO("Brazil", "South America", 26, "Luiz Inácio Lula da Silva", 214);
        CountryDTO c5 = new CountryDTO("Australia", "Oceania", 6, "David Hurley", 25);
        CountryDTO c6 = new CountryDTO("Canada", "North America", 10, "Mary Simon", 38);
        CountryDTO c7 = new CountryDTO("China", "Asia", 23, "Xi Jinping", 1410);
        CountryDTO c8 = new CountryDTO("Russia", "Europe", 85, "Vladimir Putin", 146);
        CountryDTO c9 = new CountryDTO("Japan", "Asia", 47, "Fumio Kishida", 125);
        CountryDTO c10 = new CountryDTO("France", "Europe", 18, "Emmanuel Macron", 67);
        CountryDTO c11 = new CountryDTO("UK", "Europe", 4, "Charles III", 67);
        CountryDTO c12 = new CountryDTO("Mexico", "North America", 32, "Andrés Manuel López Obrador", 126);
        CountryDTO c13 = new CountryDTO("Argentina", "South America", 23, "Javier Milei", 46);
        CountryDTO c14 = new CountryDTO("South Africa", "Africa", 9, "Cyril Ramaphosa", 59);
        CountryDTO c15 = new CountryDTO("Italy", "Europe", 20, "Sergio Mattarella", 59);
        CountryDTO c16 = new CountryDTO("Saudi Arabia", "Asia", 13, "Salman bin Abdulaziz", 35);
        CountryDTO c17 = new CountryDTO("Indonesia", "Asia", 34, "Joko Widodo", 276);
        CountryDTO c18 = new CountryDTO("Nigeria", "Africa", 36, "Bola Tinubu", 216);
        CountryDTO c19 = new CountryDTO("Egypt", "Africa", 27, "Abdel Fattah el-Sisi", 104);
        CountryDTO c20 = new CountryDTO("South Korea", "Asia", 17, "Yoon Suk-yeol", 51);

        List<CountryDTO> countryList = Stream.of(
                c1, c2, c3, c4, c5,
                c6, c7, c8, c9, c10,
                c11, c12, c13, c14, c15,
                c16, c17, c18, c19, c20
        ).collect(Collectors.toList());


        System.out.println("1. Sort by Population (Ascending):");
        countryList.stream().sorted(populationComparator).forEach(System.out::println);

        System.out.println("2. Sort by State Count:");
        countryList.stream().sorted(stateCountComparator).forEach(System.out::println);

        System.out.println("3. Sort by Country Name:");
        countryList.stream().sorted(nameComparator).forEach(System.out::println);

        System.out.println("4. Sort by Continent:");
        countryList.stream().sorted(continentComparator).forEach(System.out::println);

        System.out.println("5. Sort by President Name:");
        countryList.stream().sorted(presidentNameComparator).forEach(System.out::println);

        System.out.println("6. Sort by Continent then President Name:");
        countryList.stream().sorted(continentThenPresident).forEach(System.out::println);

        System.out.println("7. Filter: Population > 500 Million:");
        countryList.stream()
                .filter(c -> c.getPolulationInMillion() > 500)
                .sorted(populationComparator)
                .forEach(System.out::println);

        System.out.println("8. Filter: Continent is Asia:");
        countryList.stream()
                .filter(c -> c.getContinent().equalsIgnoreCase("Asia"))
                .forEach(System.out::println);
    }
}
