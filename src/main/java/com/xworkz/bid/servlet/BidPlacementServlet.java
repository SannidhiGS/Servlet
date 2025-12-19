package com.xworkz.bid.servlet;

import com.xworkz.bid.service.BidService;
import com.xworkz.bid.service.impl.BidServiceImpl;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/placeBid")
public class BidPlacementServlet extends HttpServlet {
    private BidService bidService = new BidServiceImpl();
    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String playerName = req.getParameter("playerName");
        String teamEmail = req.getParameter("teamEmail");
        double bidAmount = Double.parseDouble(req.getParameter("bidAmount"));

       // String resultMessage = "";
        String resultMessage = bidService.placeBid(playerName, teamEmail, bidAmount);
        try {
            resultMessage = bidService.placeBid(playerName, teamEmail, bidAmount);
        } catch (Exception e) {
            e.printStackTrace();
            resultMessage = "Error occurred while placing bid.";
        }

        req.setAttribute("bidResult", resultMessage);
        req.getRequestDispatcher("BidResult.jsp").forward(req, resp);

    }
}
