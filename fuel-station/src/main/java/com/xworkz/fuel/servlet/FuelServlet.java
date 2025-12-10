package com.xworkz.fuel.servlet;
import com.xworkz.fuel.dto.FuelDTO;
import com.xworkz.fuel.dto.SearchDTO;
import com.xworkz.fuel.exception.DataInvalidException;
import com.xworkz.fuel.exception.DuplicateDataException;
import com.xworkz.fuel.service.FuelService;
import com.xworkz.fuel.service.impl.FuelServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = "/fuel",loadOnStartup = 1)
public class FuelServlet extends HttpServlet {
    FuelService fuelService=new FuelServiceImpl();
    public FuelServlet(){
        System.out.println("The fuel servlet created");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FuelService fuelService=new FuelServiceImpl();
        System.out.println("The fuel station details: ");
       String station=req.getParameter("station");
       String type=req.getParameter("type");
       String quantity=req.getParameter("quantity");
       String price=req.getParameter("price");
       String bar=req.getParameter("bar");

       req.setAttribute("station",station);
       req.setAttribute("type",type);
       req.setAttribute("quantity",quantity);
       req.setAttribute("price",price);
       req.setAttribute("bar",bar);
        FuelDTO fuelDTO=new FuelDTO();
        fuelDTO.setStation(station);
        fuelDTO.setType(type);
        fuelDTO.setPrice(Double.parseDouble(price));
        fuelDTO.setQuantity(Double.parseDouble(quantity));
        fuelDTO.setBar(bar);
        System.out.println(fuelDTO);
        try {
            fuelService.validAndSave(fuelDTO);
            req.setAttribute("successMessage","Your data saved succesfully!");
        } catch (DataInvalidException|DuplicateDataException  e) {
            System.out.println("The data is not valid");
            req.setAttribute("failureMessage","Invalid data");
            req.getRequestDispatcher("result.jsp").forward(req,resp);
            throw new RuntimeException(e);
        }
        req.getRequestDispatcher("result.jsp").forward(req,resp);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String submit = req.getParameter("submit");

        if ("clear".equalsIgnoreCase(submit)) {
            req.setAttribute("dto", null);
            req.setAttribute("message", null);
        } else {
            String bar = req.getParameter("bar");

            if (bar == null || bar.isEmpty()) {
                req.setAttribute("message", "Please enter a barcode");
            } else {
                // Pass the barcode string directly
                SearchDTO seacrchDTO=new SearchDTO();
                Optional<FuelDTO> optionalSearchDTO = this.fuelService.findByBarcode(seacrchDTO);

                if (optionalSearchDTO.isPresent()) {
                    req.setAttribute("dto", optionalSearchDTO.get());
                    req.setAttribute("message", "Data fetched successfully!");
                } else {
                    req.setAttribute("message", "Search results not found");
                }
            }
        }

        req.getRequestDispatcher("BarcodeSearch.jsp").forward(req, resp);
    }
}
