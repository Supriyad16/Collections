package com.xworkz.hat.dto;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class CountryDTO {

    private String name;
    private String continent;
    private int noOfStates;
    private String presidentName;
    private int polulationInMillion
;}
