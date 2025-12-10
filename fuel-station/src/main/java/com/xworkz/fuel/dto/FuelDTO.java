package com.xworkz.fuel.dto;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class FuelDTO {
    private String station;
    private String type;
    private double quantity;
    private double price;
    private String bar;
}
