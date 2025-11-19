package com.xworkz.servlet;

import com.xworkz.dto.SurveyDTO;
import com.xworkz.exception.DataInvalidException;
import com.xworkz.service.SurveyService;
import com.xworkz.service.impl.SurveyServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/survey",loadOnStartup = 1)
public class SurveyServlet extends HttpServlet {
    SurveyService surveyService=new SurveyServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("The personal details of the person: ");
        String name=req.getParameter("name");
        String fatherName=req.getParameter("fatherName");
        String motherName=req.getParameter("motherName");
        String married=req.getParameter("married");
        String spouseName=req.getParameter("spouseName");
        String age=req.getParameter("age");
        String dob=req.getParameter("dob");
        String motherTongue=req.getParameter("motherTongue");
        String religion=req.getParameter("religion");
        String caste=req.getParameter("caste");
        String complexion=req.getParameter("complexion");
        String height=req.getParameter("height");
        String weight=req.getParameter("weight");
        String bloodGroup=req.getParameter("bloodGroup");
        String diseases=req.getParameter("diseases");


        req.setAttribute("name",name);
        req.setAttribute("fatherName",fatherName);
        req.setAttribute("motherName",motherName);
        req.setAttribute("married",married);
        req.setAttribute("spouseName",spouseName);
        req.setAttribute("age",age);
        req.setAttribute("dob",dob);
        req.setAttribute("motherTongue",motherTongue);
        req.setAttribute("religion",religion);
        req.setAttribute("caste",caste);
        req.setAttribute("complexion",complexion);
        req.setAttribute("height",height);
        req.setAttribute("weight",weight);
        req.setAttribute("complexion",complexion);
        req.setAttribute("bloodGroup",bloodGroup);
        req.setAttribute("diseases",diseases);

        System.out.println("The Contact details of the person: ");

        String mobile = req.getParameter("mobile");
        String nativePlace = req.getParameter("nativePlace");
        req.setAttribute("mobile", mobile);
        req.setAttribute("nativePlace", nativePlace);

        System.out.println("The identity details of the person:");

        String aadhar = req.getParameter("aadhar");
        String pancard = req.getParameter("pancard");
        String voterId = req.getParameter("voterId");
        String passport = req.getParameter("passport");
        String rationCard = req.getParameter("rationCard");
        String rtc = req.getParameter("rtc");

        req.setAttribute("aadhar", aadhar);
        req.setAttribute("pancard", pancard);
        req.setAttribute("voterId", voterId);
        req.setAttribute("passport", passport);
        req.setAttribute("rationCard", rationCard);
        req.setAttribute("rtc", rtc);

        System.out.println("The family details of the person:");

        String children = req.getParameter("children");
        String familyMembers = req.getParameter("familyMembers");
        String friends = req.getParameter("friends");

        req.setAttribute("children", children);
        req.setAttribute("familyMembers", familyMembers);
        req.setAttribute("friends", friends);
        System.out.println("The property details of the person:");

        String land = req.getParameter("land");
        String sites = req.getParameter("sites");
        String ownerName = req.getParameter("ownerName");
        String crop = req.getParameter("crop");
        String gold = req.getParameter("gold");
        String silver = req.getParameter("silver");

        req.setAttribute("land", land);
        req.setAttribute("sites", sites);
        req.setAttribute("ownerName", ownerName);
        req.setAttribute("crop", crop);
        req.setAttribute("gold", gold);
        req.setAttribute("silver", silver);

        System.out.println("The vehicle details of the person:");

        String bike = req.getParameter("bike");
        String car = req.getParameter("car");
        String cycles = req.getParameter("cycles");
        String shoes = req.getParameter("shoes");
        String shoeSize = req.getParameter("shoeSize");

        req.setAttribute("bike", bike);
        req.setAttribute("car", car);
        req.setAttribute("cycles", cycles);
        req.setAttribute("shoes", shoes);
        req.setAttribute("shoeSize", shoeSize);

        System.out.println("The financial details of the person:");

        String income = req.getParameter("income");
        String bank = req.getParameter("bank");
        String loanNo = req.getParameter("loanNo");
        String loanBalance = req.getParameter("loanBalance");
        String loanType = req.getParameter("loanType");
        String taxes = req.getParameter("taxes");
        String shares = req.getParameter("shares");

        req.setAttribute("income", income);
        req.setAttribute("bank", bank);
        req.setAttribute("loanNo", loanNo);
        req.setAttribute("loanBalance", loanBalance);
        req.setAttribute("loanType", loanType);
        req.setAttribute("taxes", taxes);
        req.setAttribute("shares", shares);

        System.out.println("The insurance details of the person:");

        String insuranceCompany = req.getParameter("insuranceCompany");
        String insuranceNo = req.getParameter("insuranceNo");

        req.setAttribute("insuranceCompany", insuranceCompany);
        req.setAttribute("insuranceNo", insuranceNo);

        System.out.println("The electronics details of the person:");

        String laptop = req.getParameter("laptop");
        String tv = req.getParameter("tv");

        req.setAttribute("laptop", laptop);
        req.setAttribute("tv", tv);



        System.out.println("The bills details of the person:");

        String electricity = req.getParameter("electricity");
        String waterBill = req.getParameter("waterBill");

        req.setAttribute("electricity", electricity);
        req.setAttribute("waterBill", waterBill);

        System.out.println("The employment details of the person:");

        String occupation = req.getParameter("occupation");
        String govEmployee = req.getParameter("govEmployee");
        String disabled = req.getParameter("disabled");

        req.setAttribute("occupation", occupation);
        req.setAttribute("govEmployee", govEmployee);
        req.setAttribute("disabled", disabled);

        System.out.println("The animals details of the person:");

        String pet = req.getParameter("pet");
        String cows = req.getParameter("cows");

        req.setAttribute("pet", pet);
        req.setAttribute("cows", cows);

        SurveyDTO surveyDTO = new SurveyDTO(name,fatherName,motherName,married,spouseName,age,dob,motherTongue,religion,caste,complexion,height,weight,bloodGroup,diseases,mobile,nativePlace,aadhar,pancard,voterId,passport,rationCard,rtc,children,familyMembers,friends,land,sites,ownerName,crop,gold,silver,bike,car,cycles,shoes,shoeSize,income,bank,loanNo,loanBalance,loanType,taxes,shares,insuranceCompany,insuranceNo,laptop,tv,electricity,waterBill,occupation,govEmployee,disabled,pet,cows);

        System.out.println("SurveyDTO-->"+surveyDTO);

        try {
            surveyService.validAndSave(surveyDTO);
            req.setAttribute("successMessage","Your Data Saved Successfully");
        } catch (DataInvalidException e) {
            System.err.println("Invalid Data");
            req.setAttribute("errorMessage","Your Data not Saved Successfully");
            req.getRequestDispatcher("result.jsp").forward(req,resp);
        }

        req.getRequestDispatcher("result.jsp").forward(req,resp);
    }
}
