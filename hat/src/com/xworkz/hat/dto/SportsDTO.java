package com.xworkz.hat.dto;


import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class SportsDTO {

    private  String name;
    private int noOfPlayers;
    private String type;
    private String equipment;
    private String originCountry;
    private LocalDateTime localDateTime;
}
