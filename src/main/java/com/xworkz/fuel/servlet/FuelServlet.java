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
        System.out.println("The fuel servlet contructor created");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Getting the request parameter");
        String name=req.getParameter("name");
        String location=req.getParameter("location");
        String barcode=req.getParameter("barcode");
        String fuelType=req.getParameter("fuelType");

        System.out.println("Setting the data using the set attribute");
        req.setAttribute("name",name);
        req.setAttribute("location",location);
        req.setAttribute("barcode",barcode);
        req.setAttribute("fuelType",fuelType);
        FuelDTO fuelDTO=new FuelDTO();

        fuelDTO.setFuelType(fuelType);
        fuelDTO.setName(name);
        fuelDTO.setBarcode(barcode);
        fuelDTO.setLocation(location);
        System.out.println("FuelDTO details: "+fuelDTO);

        System.out.println("Saving the data from serviceImpl");
        try {
            fuelService.validAndSave(fuelDTO);
            req.setAttribute("successMessage","Your data saved successfully");
        } catch (DataInvalidException |DuplicateDataException e) {
            req.setAttribute("errorMessage", "Your data is duplicate");
            req.getRequestDispatcher("result.jsp").forward(req, resp);
            //throw new RuntimeException(e);
        }
        req.getRequestDispatcher("result.jsp").forward(req,resp);

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String submit = req.getParameter("submit");

        if ("clear".equalsIgnoreCase(submit)) {
            req.setAttribute("dto", null);
            req.setAttribute("message", "Cleared");
        } else {
            String barcode = req.getParameter("barcode");

            SearchDTO searchDTO = new SearchDTO(barcode);
            Optional<FuelDTO> optionalDTO = this.fuelService.findByBarcode(searchDTO);

            if (optionalDTO.isPresent()) {
                req.setAttribute("dto", optionalDTO.get());
            } else {
                req.setAttribute("dto", null);
                req.setAttribute("message", "Search results not found");
            }
        }
        req.getRequestDispatcher("Search.jsp").forward(req, resp);
    }
}
