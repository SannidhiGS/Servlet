package com.xworkz.bid.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class BidDTO {
    private String name;
    private int age;
    private String playerType;
    private String state;
    private Double battingAvg;
    private Double bowlingAvg;
    private Integer numOfStumps;
}
