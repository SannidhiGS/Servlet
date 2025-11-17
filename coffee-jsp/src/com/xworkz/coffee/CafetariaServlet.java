package com.xworkz.coffee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/cafe",loadOnStartup = 1)

public class CafetariaServlet extends HttpServlet {
    public CafetariaServlet(){
        System.out.println("The CafeTaria Servlet is created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String location=req.getParameter("location");
        String type=req.getParameter("type");
        String price=req.getParameter("price");
        String franch=req.getParameter("franch");
        String owner=req.getParameter("owner");
        String gst=req.getParameter("gst");

        req.setAttribute("name",name);
        req.setAttribute("location",location);
        req.setAttribute("type",type);
        req.setAttribute("price",price);
        req.setAttribute("franch",franch);
        req.setAttribute("owner",owner);
        req.setAttribute("gst",gst);
        req.getRequestDispatcher("CafeR.jsp").forward(req,resp);

    }
}
