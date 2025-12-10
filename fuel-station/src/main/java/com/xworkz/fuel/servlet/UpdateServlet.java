package com.xworkz.fuel.servlet;
import com.xworkz.fuel.dto.FuelDTO;
import com.xworkz.fuel.service.FuelService;
import com.xworkz.fuel.service.impl.FuelServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;
import  com.xworkz.fuel.dto.SearchDTO;
@WebServlet(urlPatterns = "/edit",loadOnStartup = 1)
public class UpdateServlet extends HttpServlet {

    private FuelService fuelService=new FuelServiceImpl();
    public UpdateServlet()
    {
        System.out.println("Created UpdateServlet ");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running doGet in UpdateServlet");
        System.out.println("forwarding to register.jsp");
        //get the data from DB
        String bar=req.getParameter("bar");
       SearchDTO searchDTO=new SearchDTO(bar);

        Optional<FuelDTO> optionalFuelDTO= fuelService.findByBarcode(searchDTO);
        req.setAttribute("editDTO",optionalFuelDTO.get());
        req.getRequestDispatcher("Update.jsp").forward(req,resp);
    }
}

