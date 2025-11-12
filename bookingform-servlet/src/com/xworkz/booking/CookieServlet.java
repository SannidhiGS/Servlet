package com.xworkz.booking;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CookieServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie=new Cookie("Tokiyo","SANNI_$innas#@89678*");
        resp.addCookie(cookie);
        resp.sendRedirect("index.html");
        cookie.setDomain("x-workz");
    }
}
