package com.xworkz.coffee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/cookie",loadOnStartup = 1)
public class CookieServlet extends HttpServlet {
    public CookieServlet(){
        System.out.println("The cookie servlet created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie=new Cookie("Sannidhi","sanni#23566!345*&^");
        resp.addCookie(cookie);
        resp.sendRedirect("index.jsp");
        //cookie.setDomain("x-workz");
    }
}
