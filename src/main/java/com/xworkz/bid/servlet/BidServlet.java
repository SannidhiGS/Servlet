package com.xworkz.bid.servlet;

import com.xworkz.bid.dao.impl.BidDAOImpl;
import com.xworkz.bid.dto.BidDTO;
import com.xworkz.bid.exception.DataDuplicationException;
import com.xworkz.bid.exception.DataInvalidException;
import com.xworkz.bid.service.BidService;
import com.xworkz.bid.service.impl.BidServiceImpl;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/bid", loadOnStartup = 1)
public class BidServlet extends HttpServlet {
    public BidServlet(){
        System.out.println("The bidServlet created");
    }
    BidService bidService=new BidServiceImpl();
    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Getting Bid information ");
        String name=req.getParameter("name");
        String age=req.getParameter("age");
        String playerType=req.getParameter("playerType");
        String state=req.getParameter("state");
        String battingAvg=req.getParameter("battingAvg");
        String bowlingAvg=req.getParameter("bowlingAvg");
        String numOfStumps=req.getParameter("numOfStumps");

        System.out.println("Setting the attribute using the request parameter");
        req.setAttribute("name",name);
        req.setAttribute("age",age);
        req.setAttribute("playerType",playerType);
        req.setAttribute("state",state);
        req.setAttribute("battingAvg",battingAvg);
        req.setAttribute("bowlingAvg",bowlingAvg);
        req.setAttribute("numOfStumps",numOfStumps);


        System.out.println("Creating the instance of the BidDTO");
        BidDTO bidDTO = new BidDTO();
        bidDTO.setName(name);
        bidDTO.setPlayerType(playerType);
        bidDTO.setState(state);
        if (age != null && !age.isEmpty()) {
            bidDTO.setAge(Integer.parseInt(age));
        }
        if (battingAvg != null && !battingAvg.isEmpty()) {
            bidDTO.setBattingAvg(Double.parseDouble(battingAvg));
        } else {
            bidDTO.setBattingAvg(0.0);
        }
        if (bowlingAvg != null && !bowlingAvg.isEmpty()) {
            bidDTO.setBowlingAvg(Double.parseDouble(bowlingAvg));
        } else {
            bidDTO.setBowlingAvg(0.0);
        }
        if (numOfStumps != null && !numOfStumps.isEmpty()) {
            bidDTO.setNumOfStumps(Integer.parseInt(numOfStumps));
        } else {
            bidDTO.setNumOfStumps(0);
        }

        try {
            bidService.validAndSave(bidDTO);
            req.setAttribute("message", "Bid saved successfully!");
        } catch (DataDuplicationException | DataInvalidException e) {
            req.setAttribute("errorMessage", "Duplicate bid detected. Please check and try again.");
        }
        req.getRequestDispatcher("Response.jsp").forward(req,resp);
    }
}
