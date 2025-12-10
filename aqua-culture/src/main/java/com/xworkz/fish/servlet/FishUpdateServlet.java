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
import java.util.Optional;

@WebServlet(urlPatterns = "/edit",loadOnStartup = 1)
public class FishUpdateServlet extends HttpServlet {

    private FishService fishService = new FishServiceImpl();

    public FishUpdateServlet() {
        System.out.println("Created FishUpdateServlet ");
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
        FishDTO fishDTO = new FishDTO();
        fishDTO.setOwner(owner);
        fishDTO.setFishType(fishType);
        fishDTO.setPondSize(Float.parseFloat(pondSize));
        fishDTO.setQuantity(Integer.parseInt(quantity));
        fishDTO.setLocation(location);
        fishDTO.setPhone(phone);
        System.out.println("The fish farm details " + fishDTO);
        req.getRequestDispatcher("result.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running doGet in FishUpdateServlet");
        System.out.println("forwarding to fish.jsp");
        //get the data from DB
        String mobileNo=req.getParameter("mobileNo");
        SearchDTO searchDTO=new SearchDTO(mobileNo);
        Optional<FishDTO> optionalFishDTO= fishService.findByPhone(searchDTO);
        req.setAttribute("editDTO",optionalFishDTO.get());
        req.getRequestDispatcher("FishUpdate.jsp").forward(req,resp);

    }
}
