package com.xworkz.coffee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/land",loadOnStartup = 1)
public class CoffeeLandServlet extends HttpServlet {
    public CoffeeLandServlet(){
        System.out.println("The Coffee land servlet created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String size=req.getParameter("size");
        String total=req.getParameter("total");
        String quantity= req.getParameter("quantity");
        String expend=req.getParameter("expend");
        String profit=req.getParameter("profit");
        String Fert=req.getParameter("Fert");

        req.setAttribute("Size",size);
        req.setAttribute("Total",total);
        req.setAttribute("Quantity",quantity);
        req.setAttribute("Expenditure",expend);
        req.setAttribute("Profit",profit);
        req.setAttribute("Fertilizer",Fert);
        req.getRequestDispatcher("LandR.jsp").forward(req,resp);

    }
}
