package com.xworkz.fish.servlet;

import com.xworkz.fish.dto.FishDTO;
import com.xworkz.fish.dto.SearchDTO;
import com.xworkz.fish.exception.DataDuplicateExecption;
import com.xworkz.fish.exception.DataInvalidException;
import com.xworkz.fish.service.FishService;
import com.xworkz.fish.service.impl.FishServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@WebServlet(urlPatterns = "/fish", loadOnStartup = 1)
public class AquaServlet extends HttpServlet {
    FishService fishService = new FishServiceImpl();

    public AquaServlet() {
        System.out.println("The aqua servlet created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("The aqua marine farm details are:");
        String owner = req.getParameter("owner");
        String fishType = req.getParameter("fishType");
        String pondSize = req.getParameter("pondSize");
        String quantity = req.getParameter("quantity");
        String location = req.getParameter("location");
        String phone = req.getParameter("phone");


        req.setAttribute("owner", owner);
        req.setAttribute("fishType", fishType);
        req.setAttribute("pondSize", pondSize);
        req.setAttribute("quantity", quantity);
        req.setAttribute("location", location);
        req.setAttribute("phone", phone);

        Cookie[] cookies = req.getCookies();
        if (cookies == null || cookies.length == 0) {
            System.out.println("The cookies are not valid");
        } else {
            for (Cookie cookie : cookies) {
                System.out.println("Cookie Name: " + cookie.getName() + "Cookie value :" + cookie.getValue());
            }
        }

        //FishDTO fishDTO=new FishDTO(owner, fishType, pondSize, quantity, location, phone,);
        FishDTO fishDTO = new FishDTO();
        fishDTO.setOwner(owner);
        fishDTO.setFishType(fishType);
        fishDTO.setPondSize(Float.parseFloat(pondSize));
        fishDTO.setQuantity(Integer.parseInt(quantity));
        fishDTO.setLocation(location);
        fishDTO.setPhone(phone);
        System.out.println("The fish farm details " + fishDTO);
        try {
            fishService.validAndSave(fishDTO);
            req.setAttribute("successMessage", "Your data saved successfully");

        } catch (DataInvalidException | DataDuplicateExecption e) {
            System.out.println("The data is not valid");
            req.setAttribute("errorMessage", "Your data is duplicate");
            req.getRequestDispatcher("result.jsp").forward(req, resp);
            throw new RuntimeException(e);
        }
        req.getRequestDispatcher("result.jsp").forward(req, resp);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String submit = req.getParameter("submit");

        if ("clear".equalsIgnoreCase(submit)) {
            req.setAttribute("dto", null);
            req.setAttribute("message", "Cleared");
        } else {
            String phone = req.getParameter("phone");

            SearchDTO searchDTO = new SearchDTO(phone);
            Optional<FishDTO> optionalFishDTO = this.fishService.findByPhone(searchDTO);

            if (optionalFishDTO.isPresent()) {
                req.setAttribute("dto", optionalFishDTO.get());
            } else {
                req.setAttribute("dto", null);
                req.setAttribute("message", "Search results not found");
            }
        }

        req.getRequestDispatcher("FishSearch.jsp").forward(req, resp);
    }

}
