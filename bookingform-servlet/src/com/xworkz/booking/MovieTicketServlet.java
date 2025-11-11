package com.xworkz.booking;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/movie",loadOnStartup = 1)
public class MovieTicketServlet extends HttpServlet {
    public MovieTicketServlet(){
        System.out.println("The movie Ticket Booking Servlet");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("The Movie Ticket Servlet initiated");
        super.init(config);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String moviez=req.getParameter("moviez");
        String comment=req.getParameter("comment");
        String seatType=req.getParameter("seatType");

        resp.setContentType("text/html");
        PrintWriter printWriter=resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<body style='background-color:pink'>");
        printWriter.println("<h1 style='color:purple'>Your Booking Details are as follows</h1>");
        printWriter.println("<pre>");
        printWriter.println("Name: "+name);
        printWriter.println("Email: "+email);
        printWriter.println("movie: "+moviez);
        printWriter.println("Comment: "+comment);
        printWriter.println("Seat type: "+seatType);
        printWriter.println("</pre>");
        printWriter.println("<a href='Movie.html' class='btn btn-outline-danger'>Book Again</a>");
        printWriter.println("</body>");
        printWriter.println("</html>");

    }
}
