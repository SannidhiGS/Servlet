package com.xworkz.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor
public class FishDTO implements Serializable,Comparable<String> {
    private String owner;
    private String fishType;
    private String pondSize;
    private String quantity;
    private String location;
    private String phone;

    @Override
    public int compareTo(String o) {
        return this.owner.compareTo(o);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FishDTO fishDTO = (FishDTO) o;
        return Objects.equals(owner, fishDTO.owner) && Objects.equals(fishType, fishDTO.fishType) && Objects.equals(pondSize, fishDTO.pondSize) && Objects.equals(quantity, fishDTO.quantity) && Objects.equals(location, fishDTO.location) && Objects.equals(phone, fishDTO.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, fishType, pondSize, quantity, location, phone);
    }
}
