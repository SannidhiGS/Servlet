package com.xworkz.bid.servlet;

import com.xworkz.bid.dao.BidDAO;
import com.xworkz.bid.dto.BidDTO;
import com.xworkz.bid.service.BidService;
import com.xworkz.bid.service.impl.BidServiceImpl;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
@WebServlet("/enterBid")
public class BidEntryServlet extends HttpServlet {

    private BidService bidService = new BidServiceImpl();

    @SneakyThrows
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String email = req.getParameter("email");

        List<BidDTO> players =
                bidService.validateEmailAndGetPlayers(email);

        if (players.isEmpty()) {
            req.setAttribute("error", "Invalid email");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        } else {
            req.setAttribute("players", players);
            req.getRequestDispatcher("players.jsp").forward(req, resp);
        }
    }
}
