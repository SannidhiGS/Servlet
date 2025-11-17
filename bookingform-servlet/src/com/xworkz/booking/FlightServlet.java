package com.xworkz.booking;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns ="/flight",loadOnStartup = 1)
public class FlightServlet extends HttpServlet {
    public FlightServlet(){
        System.out.println("The Flight Servlet");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("The Flight Servlet initiated");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Get form data
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String destination = req.getParameter("destination");
        String comment = req.getParameter("comment");
        String seatType = req.getParameter("seatType");

        Cookie[] cookies=req.getCookies();
        if(cookies==null && cookies.length<1){
            throw new IllegalArgumentException("Cookie not found and please create a cookie");
        }
        else{
            for(Cookie cookie:cookies){
                System.out.println("The name of the cookie"+cookie.getName()+"The value"+cookie.getValue());
            }
        }

        // Set content type
        resp.setContentType("text/html");

        // Write styled HTML response
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Flight Booking Confirmation</title>");
        out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css' rel='stylesheet'>");
        out.println("</head>");
        out.println("<body style='background-color: #e9f7ff;'>");

        out.println("<div class='container mt-5'>");
        out.println("<div class='card shadow p-4'>");
        out.println("<h2 class='text-center text-primary mb-3'>Flight Ticket Confirmation</h2>");
        out.println("<pre style='font-size: 16px;'>");
        out.println("Passenger Name: " + name);
        out.println("Email: " + email);
        out.println("Destination: " + destination);
        out.println("Special Requests: " + comment);
        out.println("Seat Type: " + seatType);
        out.println("</pre>");
        out.println("<div class='text-center mt-3'>");
        out.println("<a href='Flight.html' class='btn btn-outline-primary'>Book Another Ticket</a>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("<a href='Flight.html' class='btn btn-outline-danger'>Book Again</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
