package com.xworkz.cattle.servlet;

import com.xworkz.cattle.dto.CattleDTO;
import com.xworkz.cattle.exeception.DataInvalidException;
import com.xworkz.cattle.exeception.DuplicateException;
import com.xworkz.cattle.service.CattleService;
import com.xworkz.cattle.service.impl.CattleServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/cattle",loadOnStartup = 1)
public class CattleServlet extends HttpServlet {
    public CattleServlet(){
        System.out.println("The Cattle servlet created");
    }
    private final CattleService service=new CattleServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CattleDTO cattleDTO=new CattleDTO();
        System.out.println("Getting cattle details");
        String owner=req.getParameter("owner");
        String type=req.getParameter("type");
        String age=req.getParameter("age");
        String weight=req.getParameter("weight");
        String location=req.getParameter("location");
        String phone = req.getParameter("phone");

        System.out.println("Setting cattle detail using the set attribute");
        req.setAttribute("owner",owner);
        req.setAttribute("type",type);
        req.setAttribute("age",age);
        req.setAttribute("weight",weight);
        req.setAttribute("location",location);
        req.setAttribute("phone",phone);

        System.out.println("Setting DTO with correct values");
        cattleDTO.setOwner(owner);
        cattleDTO.setType(type);
        cattleDTO.setAge(Integer.parseInt(age));
        cattleDTO.setWeight(Double.parseDouble(weight));
        cattleDTO.setLocation(location);
        cattleDTO.setPhone(Long.parseLong(phone));
        System.out.println("The cattle details are: "+cattleDTO);
        req.getRequestDispatcher("Result.jsp").forward(req,resp);
        boolean saved = false;
        try {
            saved = service.validateAndSave(cattleDTO);
        } catch (DataInvalidException e) {
            throw new RuntimeException(e);
        } catch (DuplicateException e) {
            throw new RuntimeException(e);
        }
        if(saved) {
            resp.sendRedirect("Result.jsp");
        } else {
            resp.getWriter().println("Invalid or Duplicate Data!");
        }
    }
}
