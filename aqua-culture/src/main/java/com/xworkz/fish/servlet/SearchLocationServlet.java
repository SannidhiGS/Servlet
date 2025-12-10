package com.xworkz.fish.servlet;

import com.xworkz.fish.dto.FishDTO;
import com.xworkz.fish.dto.SearchDTO;
import com.xworkz.fish.service.FishService;
import com.xworkz.fish.service.impl.FishServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/location",loadOnStartup = 1)
public class SearchLocationServlet extends HttpServlet {

    private FishService fishService=new FishServiceImpl();

    public SearchLocationServlet()
    {
        System.out.println("Created SearchLocationServlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running doGet in SearchLocationServlet");

        String location=req.getParameter("location");
        SearchDTO searchDTO=new SearchDTO();
        searchDTO.setLocation(location);

        System.out.println("searchDTO :"+searchDTO);
        List<FishDTO> fishDTOS= fishService.findByLocation(searchDTO);
        System.out.println("total found :"+fishDTOS.size() +" for location :"+location);

        req.setAttribute("fishList",fishDTOS);
        req.getRequestDispatcher("FishSearch2.jsp").forward(req,resp);
    }
}
