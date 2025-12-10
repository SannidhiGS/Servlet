package com.xworkz.fish.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SearchDTO implements Serializable {
    private String mobileNo;
    private String location;
    public SearchDTO(String mobileNo)
    {
        this.mobileNo=mobileNo;
    }
}
