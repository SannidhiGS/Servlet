package com.xworkz.booking;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/wish",loadOnStartup = 1)
public class WishcartServlet extends HttpServlet {
    public WishcartServlet(){
        System.out.println("The Wish Cart Servlet");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("The WishCart Servlet initiated");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("The Wishcart servlet initiated");
        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String product=req.getParameter("product");
        String comment=req.getParameter("comment");
        String payment=req.getParameter("payment");

        resp.setContentType("text/html");
        PrintWriter printWriter=resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<body style='background-color:pink'>");
        printWriter.println("<h1 style='color:purple'>Your Booking Details are as follows</h1>");
        printWriter.println("<pre>");
        printWriter.println("Name: "+name);
        printWriter.println("Email: "+email);
        printWriter.println("Product : "+product);
        printWriter.println("Comment: "+comment);
        printWriter.println("Payment type: "+payment);
        printWriter.println("</pre>");
        printWriter.println("<a href='wishcart.html' class='btn btn-outline-danger'>Book Again</a>");
        printWriter.println("</body>");
        printWriter.println("</html>");

    }
}
