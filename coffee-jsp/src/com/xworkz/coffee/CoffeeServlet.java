package com.xworkz.coffee;

import dto.CoffeeDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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

        CoffeeDTO coffeeDTO=new CoffeeDTO(type,Float.parseFloat(price),farmer,Float.parseFloat(quantity),location);
        System.out.println("CoffeeDTO-->"+coffeeDTO.toString());
        Cookie[] cookies=req.getCookies();
        if(cookies==null || cookies.length<1){
            throw new IllegalArgumentException("There is no cookie found,go and create cookie");
        }
        else{
            for(Cookie cookie:cookies){
                System.out.println("Name: "+cookie.getName()+" Value: "+cookie.getValue());
            }
        }
       req.setAttribute("Type",type);
       req.setAttribute("Price",price);
       req.setAttribute("Farmer",farmer);
       req.setAttribute("Quantity",quantity);
       req.setAttribute("Location",location);

       req.getRequestDispatcher("CoffeeR.jsp").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Coffee.jsp").forward(req,resp);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
