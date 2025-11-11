package com.xworkz.booking;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/food", loadOnStartup = 1)
public class FoodOrderServlet extends HttpServlet {

    public FoodOrderServlet() {
        System.out.println("FoodOrderServlet object created");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("FoodOrderServlet initialized");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // Read form data
        String name = req.getParameter("name");
        String phone = req.getParameter("phone");
        String foodItem = req.getParameter("foodItem");
        String delivery = req.getParameter("delivery");

        // Set response content type
        resp.setContentType("text/html");

        // Write a simple styled HTML response
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Food Order Confirmation</title>");
        out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css' rel='stylesheet'>");
        out.println("</head>");
        out.println("<body style='background-color:#fff3e6;'>");

        out.println("<div class='container mt-5'>");
        out.println("<div class='card shadow p-4'>");
        out.println("<h3 class='text-center text-danger mb-3'>Food Order Confirmation</h3>");
        out.println("<pre style='font-size: 16px;'>");
        out.println("Customer Name : " + name);
        out.println("Phone Number  : " + phone);
        out.println("Food Item     : " + foodItem);
        out.println("Delivery Mode : " + delivery);
        out.println("</pre>");
        out.println("<div class='text-center mt-3'>");
        out.println("<a href='food.html' class='btn btn-outline-danger'>Order Another</a>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
