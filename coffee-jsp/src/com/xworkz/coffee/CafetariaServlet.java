package com.xworkz.coffee;

import dto.CafetariaDTO;
import exception.DataInvalidException;
import service.CafetariaService;
import service.impl.CafetariaServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/cafe",loadOnStartup = 1)

public class CafetariaServlet extends HttpServlet {
    public CafetariaServlet(){
        System.out.println("The CafeTaria Servlet is created");
    }
    private final CafetariaService cafetariaService=new CafetariaServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String location=req.getParameter("location");
        String type=req.getParameter("type");
        String price=req.getParameter("price");
        String franch=req.getParameter("franch");
        String owner=req.getParameter("owner");
        String gst=req.getParameter("gst");

        CafetariaDTO cafetariaDTO=new CafetariaDTO(name,location,type,Float.parseFloat(price),franch,owner,Long.parseLong(gst));
        System.out.println("Cafetaria-->"+cafetariaDTO.toString());
        try {
            cafetariaService.validAndSave(cafetariaDTO);
            req.setAttribute("successMessage","Your data is Valid");
        } catch (DataInvalidException e) {
            req.setAttribute("errorMessage","Your data is not valid");
            req.getRequestDispatcher("CafeR.jsp").forward(req,resp);
            throw new RuntimeException(e);
        }

        Cookie[] cookies=req.getCookies();
        if(cookies==null ||cookies.length<1){
            throw new IllegalArgumentException("There is no cookie found , Go and create cookie");
        }
        else{
            for (Cookie cookie1:cookies) {
                System.out.println("Name: " + cookie1.getName() + " Value: " + cookie1.getValue());
            }
        }

        req.setAttribute("name",name);
        req.setAttribute("location",location);
        req.setAttribute("type",type);
        req.setAttribute("price",price);
        req.setAttribute("franch",franch);
        req.setAttribute("owner",owner);
        req.setAttribute("gst",gst);
        req.getRequestDispatcher("CafeR.jsp").forward(req,resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Cafetaria.jsp").forward(req,resp);
    }
}
