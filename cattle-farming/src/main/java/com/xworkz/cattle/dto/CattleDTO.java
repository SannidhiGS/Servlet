package com.xworkz.cattle.dto;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class CattleDTO {
    private String owner;
    private  String type;
    private int age;
    private double weight;
    private String location;
    private long phone;
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
