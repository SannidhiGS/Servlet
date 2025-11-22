package com.xworkz.coffee;

import dto.CustomerDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/customer",loadOnStartup = 1)
public class CustomerServlet extends HttpServlet {
    public CustomerServlet(){
        System.out.println("The Customer Servlet Created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String mobile=req.getParameter("mobile");
        String type=req.getParameter("type");
        String quantity=req.getParameter("quantity");
        String payment= req.getParameter("payment");

        CustomerDTO customerDTO=new CustomerDTO(name,Long.parseLong(mobile),type,Integer.parseInt(quantity),payment);
        System.out.println("Customer-->"+customerDTO.toString());

        Cookie[] cookies=req.getCookies();

        if(cookies==null|| cookies.length<1){
            throw new IllegalArgumentException("There is no cookie found , go and create a cookie");
        }
        else{
            for(Cookie cookie:cookies){
                System.out.println("Name: "+cookie.getName()+ " Value :"+cookie.getValue());
            }
        }

        req.setAttribute("name",name);
        req.setAttribute("mobile",mobile);
        req.setAttribute("type",type);
        req.setAttribute("quantity",quantity);
        req.setAttribute("payment",payment);

        req.getRequestDispatcher("CustR.jsp").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Customer.jsp").forward(req,resp);
    }
}
