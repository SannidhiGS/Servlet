package com.xworkz.booking;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/blood", loadOnStartup = 1)
public class BloodBookingServlet extends HttpServlet {

    public BloodBookingServlet() {
        System.out.println("BloodBookingServlet object created");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("BloodBookingServlet initialized");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // Retrieve form data
        String name = req.getParameter("name");
        String phone = req.getParameter("phone");
        String bloodGroup = req.getParameter("bloodGroup");
        String hospital = req.getParameter("hospital");
        String urgency = req.getParameter("urgency");

        // Set response type
        resp.setContentType("text/html");

        // Generate response HTML
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Blood Booking Confirmation</title>");
        out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css' rel='stylesheet'>");
        out.println("</head>");
        out.println("<body style='background-color:#fdecea;'>");

        out.println("<div class='container mt-5'>");
        out.println("<div class='card shadow p-4'>");
        out.println("<h3 class='text-center text-danger mb-3'>Blood Booking Confirmation</h3>");
        out.println("<pre style='font-size: 16px;'>");
        out.println("Name        : " + name);
        out.println("Phone       : " + phone);
        out.println("Blood Group : " + bloodGroup);
        out.println("Hospital    : " + hospital);
        out.println("Urgency     : " + urgency);
        out.println("</pre>");
        out.println("<div class='text-center mt-3'>");
        out.println("<a href='blood.html' class='btn btn-outline-danger'>Book Again</a>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
