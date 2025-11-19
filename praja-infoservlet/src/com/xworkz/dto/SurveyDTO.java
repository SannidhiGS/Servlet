package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class SurveyDTO implements Serializable,Comparable<String> {
    private String name;
    private String fatherName;
    private String motherName;
    private String married;
    private String spouseName;
    private String age;
    private String dob;
    private String motherTongue;
    private String religion;
    private String caste;
    private String complexion;
    private String height;
    private String weight;
    private String bloodGroup;
    private String diseases;

    private String mobile ;
    private String nativePlace ;

    private String aadhar ;
    private String pancard ;
    private String voterId ;
    private String passport ;
    private String rationCard ;
    private String rtc;

    private String children;
    private String familyMembers ;
    private String friends ;

    private String land ;
    private String sites ;
    private String ownerName ;
    private String crop ;
    private String gold ;
    private String silver ;

    private String bike ;
    private String car ;
    private String cycles ;
    private String shoes ;
    private String shoeSize ;

    private String income ;
    private String bank ;
    private String loanNo ;
    private String loanBalance ;
    private String loanType;
    private String taxes ;
    private String shares ;

    private String insuranceCompany ;
    private String insuranceNo ;

    private String laptop ;
    private String tv ;

    private String electricity;
    private String waterBill;

    private String occupation ;
    private String govEmployee ;
    private String disabled ;

    private String pet;
    private String cows;

    @Override
    public int compareTo(String o) {
        return this.name.compareTo(o);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SurveyDTO surveyDTO = (SurveyDTO) o;
        return Objects.equals(name, surveyDTO.name) && Objects.equals(fatherName, surveyDTO.fatherName) && Objects.equals(motherName, surveyDTO.motherName) && Objects.equals(married, surveyDTO.married) && Objects.equals(spouseName, surveyDTO.spouseName) && Objects.equals(age, surveyDTO.age) && Objects.equals(dob, surveyDTO.dob) && Objects.equals(motherTongue, surveyDTO.motherTongue) && Objects.equals(religion, surveyDTO.religion) && Objects.equals(caste, surveyDTO.caste) && Objects.equals(complexion, surveyDTO.complexion) && Objects.equals(height, surveyDTO.height) && Objects.equals(weight, surveyDTO.weight) && Objects.equals(bloodGroup, surveyDTO.bloodGroup) && Objects.equals(diseases, surveyDTO.diseases) && Objects.equals(mobile, surveyDTO.mobile) && Objects.equals(nativePlace, surveyDTO.nativePlace) && Objects.equals(aadhar, surveyDTO.aadhar) && Objects.equals(pancard, surveyDTO.pancard) && Objects.equals(voterId, surveyDTO.voterId) && Objects.equals(passport, surveyDTO.passport) && Objects.equals(rationCard, surveyDTO.rationCard) && Objects.equals(rtc, surveyDTO.rtc) && Objects.equals(children, surveyDTO.children) && Objects.equals(familyMembers, surveyDTO.familyMembers) && Objects.equals(friends, surveyDTO.friends) && Objects.equals(land, surveyDTO.land) && Objects.equals(sites, surveyDTO.sites) && Objects.equals(ownerName, surveyDTO.ownerName) && Objects.equals(crop, surveyDTO.crop) && Objects.equals(gold, surveyDTO.gold) && Objects.equals(silver, surveyDTO.silver) && Objects.equals(bike, surveyDTO.bike) && Objects.equals(car, surveyDTO.car) && Objects.equals(cycles, surveyDTO.cycles) && Objects.equals(shoes, surveyDTO.shoes) && Objects.equals(shoeSize, surveyDTO.shoeSize) && Objects.equals(income, surveyDTO.income) && Objects.equals(bank, surveyDTO.bank) && Objects.equals(loanNo, surveyDTO.loanNo) && Objects.equals(loanBalance, surveyDTO.loanBalance) && Objects.equals(loanType, surveyDTO.loanType) && Objects.equals(taxes, surveyDTO.taxes) && Objects.equals(shares, surveyDTO.shares) && Objects.equals(insuranceCompany, surveyDTO.insuranceCompany) && Objects.equals(insuranceNo, surveyDTO.insuranceNo) && Objects.equals(laptop, surveyDTO.laptop) && Objects.equals(tv, surveyDTO.tv) && Objects.equals(electricity, surveyDTO.electricity) && Objects.equals(waterBill, surveyDTO.waterBill) && Objects.equals(occupation, surveyDTO.occupation) && Objects.equals(govEmployee, surveyDTO.govEmployee) && Objects.equals(disabled, surveyDTO.disabled) && Objects.equals(pet, surveyDTO.pet) && Objects.equals(cows, surveyDTO.cows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, fatherName, motherName, married, spouseName, age, dob, motherTongue, religion, caste, complexion, height, weight, bloodGroup, diseases, mobile, nativePlace, aadhar, pancard, voterId, passport, rationCard, rtc, children, familyMembers, friends, land, sites, ownerName, crop, gold, silver, bike, car, cycles, shoes, shoeSize, income, bank, loanNo, loanBalance, loanType, taxes, shares, insuranceCompany, insuranceNo, laptop, tv, electricity, waterBill, occupation, govEmployee, disabled, pet, cows);
    }
}
