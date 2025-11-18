package com.xworkz.coffee;

import dto.FeedbackDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/feed",loadOnStartup = 1)
public class FeedbackServlet extends HttpServlet {
    public FeedbackServlet(){
        System.out.println("The Feedback Servlet Created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String comment=req.getParameter("comment");
        String star=req.getParameter("star");

        FeedbackDTO feedbackDTO=new FeedbackDTO( name,email,  comment, star);
        System.out.println("FeedBackDto-->"+feedbackDTO.toString());

        Cookie[] cookies=req.getCookies();
        if(cookies==null|| cookies.length<1){
            throw new IllegalArgumentException("There is no any cookie found go and create a cookie");
        }
        else{
            for(Cookie cookie:cookies){
                System.out.println("Name :"+cookie.getName()+" Value"+cookie.getValue());
            }
        }


        req.setAttribute("name",name);
        req.setAttribute("email",email);
        req.setAttribute("comment",comment);
        req.setAttribute("rate",star);

        req.getRequestDispatcher("FeedR.jsp").forward(req,resp);

    }
}
