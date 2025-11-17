package com.xworkz.coffee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/coffee",loadOnStartup = 1)
public class CoffeeServlet extends HttpServlet {
    public CoffeeServlet(){
        System.out.println("The Coffee servlet created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String type=req.getParameter("type");
        String price=req.getParameter("price");
        String farmer=req.getParameter("farmer");
        String quantity=req.getParameter("quantity");
       String location= req.getParameter("location");

       req.setAttribute("Type",type);
       req.setAttribute("Price",price);
       req.setAttribute("Farmer",farmer);
       req.setAttribute("Quantity",quantity);
       req.setAttribute("Location",location);

       req.getRequestDispatcher("CoffeeR.jsp").forward(req,resp);

    }
}
