package com.xworkz.coffee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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

        req.setAttribute("name",name);
        req.setAttribute("mobile",mobile);
        req.setAttribute("type",type);
        req.setAttribute("quantity",quantity);
        req.setAttribute("payment",payment);

        req.getRequestDispatcher("CustR.jsp").forward(req,resp);
    }
}
