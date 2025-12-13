package com.xworkz.fuel.dto;

import lombok.*;

@AllArgsConstructor
@ToString
@Getter
@Setter
@NoArgsConstructor
public class FuelDTO {
    private String name;
    private String location;
    private String barcode;
    private String fuelType;
}
