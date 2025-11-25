package com.xworkz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/matrimony",loadOnStartup = 1)

public class Matrimonyservlet extends HttpServlet {

    public Matrimonyservlet(){
        System.out.println("Create Matrimony servlet...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String forType = req.getParameter("forType");
        String gender = req.getParameter("gender");
        String dob =  req.getParameter("dob");
        String motherTongue = req.getParameter("motherTongue");
        String religion = req.getParameter("religion");
        String status = req.getParameter("status");
        String height = req.getParameter("height");
        req.setAttribute("email",email);
        req.setAttribute("forType",forType);
        req.setAttribute("gender",gender);
        req.setAttribute("dob",dob);
        req.setAttribute("motherTongue",motherTongue);
        req.setAttribute("religion",religion);
        req.setAttribute("status",status);
        req.setAttribute("height",height);

        req.getRequestDispatcher("MatrimonyResult.jsp").forward(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Matrimony.jsp").forward(req,resp);
    }
}
