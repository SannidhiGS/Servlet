package com.xworkz.service.impl;

import com.xworkz.dto.SurveyDTO;
import com.xworkz.exception.DataInvalidException;
import com.xworkz.service.SurveyService;

public class SurveyServiceImpl implements SurveyService {
    @Override
    public void validAndSave(SurveyDTO surveyDTO) throws DataInvalidException {

        String name=surveyDTO.getName();
         String fatherName=surveyDTO.getFatherName();
        String motherName=surveyDTO.getMotherName();
        String married=surveyDTO.getMarried();
        String spouseName=surveyDTO.getSpouseName();
         String age=surveyDTO.getAge();
         String dob=surveyDTO.getDob();
         String motherTongue=surveyDTO.getMotherTongue();
        String religion=surveyDTO.getReligion();
         String caste=surveyDTO.getCaste();
         String complexion=surveyDTO.getComplexion();
         String height=surveyDTO.getHeight();
         String weight= surveyDTO.getWeight();
         String bloodGroup=surveyDTO.getBloodGroup();
         String diseases=surveyDTO.getDiseases();
        String mobile = surveyDTO.getMobile();
        String nativePlace = surveyDTO.getNativePlace();

        String aadhar = surveyDTO.getAadhar();
        String pancard = surveyDTO.getPancard();
        String voterId = surveyDTO.getVoterId();
        String passport = surveyDTO.getPassport();
        String rationCard = surveyDTO.getRationCard();
        String rtc = surveyDTO.getRtc();

        String children = surveyDTO.getChildren();
        String familyMembers = surveyDTO.getFamilyMembers();
        String friends = surveyDTO.getFriends();

        String land = surveyDTO.getLand();
        String sites = surveyDTO.getSites();
        String ownerName = surveyDTO.getOwnerName();
        String crop = surveyDTO.getCrop();
        String gold = surveyDTO.getGold();
        String silver = surveyDTO.getSilver();

        String bike = surveyDTO.getBike();
        String car = surveyDTO.getCar();
        String cycles = surveyDTO.getCycles();
        String shoes = surveyDTO.getShoes();
        String shoeSize = surveyDTO.getShoeSize();

        String income = surveyDTO.getIncome();
        String bank = surveyDTO.getBank();
        String loanNo = surveyDTO.getLoanNo();
        String loanBalance = surveyDTO.getLoanBalance();
        String loanType = surveyDTO.getLoanType();
        String taxes = surveyDTO.getTaxes();
        String shares = surveyDTO.getShares();

        String insuranceCompany = surveyDTO.getInsuranceCompany();
        String insuranceNo = surveyDTO.getInsuranceNo();

        String laptop = surveyDTO.getLaptop();
        String tv = surveyDTO.getTv();

        String electricity = surveyDTO.getElectricity();
        String waterBill = surveyDTO.getWaterBill();

        String occupation = surveyDTO.getOccupation();
        String govEmployee = surveyDTO.getGovEmployee();
        String disabled = surveyDTO.getDisabled();

        String pet = surveyDTO.getPet();
        String cows = surveyDTO.getCows();


        boolean inValid = false;

        if (name==null||name.length()< 3) {
            inValid = true;
        }
        else if (fatherName==null||fatherName.length() < 3) {
            inValid = true;
        }
        else if (motherName== null||motherName.length() < 3) {
            inValid = true;
        }
        else if (married==null||married.length()<2) {
            inValid = true;
        }
        else if (spouseName==null ||spouseName.length()< 3) {
            inValid = true;
        }
        else if (age == null|| age.length()< 1) {
            inValid = true;
        }
        else if (dob == null || dob.length()< 3) {
            inValid = true;
        }
        else if (motherTongue== null || motherTongue.length()< 3) {
            inValid = true;
        }
        else if (religion == null || religion.length() < 3) {
            inValid = true;
        }
        else if (caste == null || caste.length() < 3) {
            inValid = true;
        }
        else if (complexion == null || complexion.length() < 3) {
            inValid = true;
        }
        else if (height == null ||height.length() < 1) {
            inValid = true;
        }
        else if (weight == null ||weight.length() < 1) {
            inValid = true;
        }
        else if (bloodGroup == null ||bloodGroup.length()< 3) {
            inValid = true;
        }
        else if (diseases == null ||diseases.length()< 3) {
            inValid = true;
        }
        else if (mobile== null ||mobile.length()< 3) {
            inValid = true;
        }
        else if (nativePlace== null || nativePlace.length()< 3) {
            inValid = true;
        }
        else if (aadhar == null ||aadhar.length() < 3) {
            inValid = true;
        }
        else if (pancard == null ||pancard.length() < 3) {
            inValid = true;
        }
        else if (voterId == null || voterId.length() < 3) {
            inValid = true;
        }
        else if (passport == null || passport.length() < 3) {
            inValid = true;
        }
        else if (rationCard == null || rationCard.length() < 3) {
            inValid = true;
        }
        else if (rtc == null || rtc.length() < 3) {
            inValid = true;
        }
        else if (children == null ||children.length() < 1) {
            inValid = true;
        }
        else if (familyMembers == null ||familyMembers.length() < 1) {
            inValid = true;
        }
        else if (friends == null || friends.length() < 3) {
            inValid = true;
        }
        else if (land== null ||land.length() < 1) {
            inValid = true;
        }
        else if (sites== null ||sites.length() < 1) {
            inValid = true;
        }
        else if (ownerName==null ||ownerName.length() < 3) {
            inValid = true;
        }
        else if (crop == null || crop.length() < 3) {
            inValid = true;
        }
        else if (gold == null || gold.length() < 1) {
            inValid = true;
        }
        else if (silver == null ||silver.length()< 1) {
            inValid = true;
        }
        else if (bike == null || bike.length() < 3) {
            inValid = true;
        }
        else if (car == null || car.length() < 3) {
            inValid = true;
        }
        else if (cycles == null || cycles.length()< 1) {
            inValid = true;
        }
        else if (shoes == null || shoes.length()< 1) {
            inValid = true;
        }
        else if (shoeSize == null || shoeSize.length()< 1) {
            inValid = true;
        }
        else if (income == null || income.length()< 1) {
            inValid = true;
        }
        else if (bank == null || bank.length() < 3) {
            inValid = true;
        }
        else if (loanNo== null || loanNo.length()< 1) {
            inValid = true;
        }
        else if (loanBalance == null || loanBalance.length()< 1) {
            inValid = true;
        }
        else if (loanType == null || loanType.length() < 3) {
            inValid = true;
        }
        else if (taxes == null || taxes.length() < 1) {
            inValid = true;
        }
        else if (shares == null || shares.length() < 1) {
            inValid = true;
        }
        else if (insuranceCompany == null || insuranceCompany.length() < 3) {
            inValid = true;
        }
        else if (insuranceNo == null || insuranceNo.length() < 1) {
            inValid = true;
        }
        else if (laptop == null || laptop.length() < 3) {
            inValid = true;
        }
        else if (tv == null || tv.length() < 3) {
            inValid = true;
        }
        else if (electricity== null || electricity.length() < 1) {
            inValid = true;
        }
        else if (waterBill == null || waterBill.length() < 1) {
            inValid = true;
        }
        else if (occupation == null || occupation.length() < 3) {
            inValid = true;
        }
        else if (govEmployee == null || govEmployee.length() < 2) {
            inValid = true;
        }
        else if (disabled == null || disabled.length()< 1) {
            inValid = true;
        }
        else if (pet == null || pet.length()< 3) {
            inValid = true;
        }
        else if (cows== null ||cows.length()< 1) {
            inValid = true;
        }

        if (inValid) {
            throw new DataInvalidException("The provided data is not valid");
        }
    }
}
