package com.xworkz.forms;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/passport",loadOnStartup = 1)
public class PassPortSevaServlet extends GenericServlet {
    public PassPortSevaServlet(){
        System.out.println("The passport servlet");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("The Passport seva servlet running");
        String radioDefault=servletRequest.getParameter("radioDefault");
        String passportOffice=servletRequest.getParameter("passportOffice");
        String name=servletRequest.getParameter("name");
        String sname=servletRequest.getParameter("sname");
        String date=servletRequest.getParameter("date");
        String email=servletRequest.getParameter("email");
        String yes=servletRequest.getParameter("yes");
        String no=servletRequest.getParameter("no");
        String log=servletRequest.getParameter("log");
        String password=servletRequest.getParameter("password");
        String cpassword=servletRequest.getParameter("cpassword");
        String answer=servletRequest.getParameter("hintQuestion");
        String capta=servletRequest.getParameter("capta");
        String reg=servletRequest.getParameter("reg");
        String clr=servletRequest.getParameter("clr");
        System.out.println(
                "PassportOfficeSelect: " + radioDefault + "\n" +
                        "Passport office list: " + passportOffice + "\n" +
                        "Name: " + name + "\n" +
                        "Surname: " + sname + "\n" +
                        "Date: " + date + "\n" +
                        "Email: " + email + "\n" +
                        "Same email: " + yes + ", " + no + "\n" +
                        "Login Id: " + log + "\n" +
                        "Password: " + password + "\n" +
                        "Confirm Password: " + cpassword + "\n" +
                        "Hint Question: " + answer + "\n" +
                        "Captcha: " + capta + "\n" +
                        "Clear: " + clr
        );
        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();
        writer.println("Data Successfully Saved......."+name);
        writer.println(radioDefault);
        writer.println(passportOffice);
        writer.println(name);
        writer.println(sname);
        writer.println(date);
        writer.println(email);
        writer.println(yes);
        writer.println(no);
        writer.println(log);
        writer.println(password);
        writer.println(cpassword);
        writer.println(answer);
        writer.println(capta);
    }


    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("The Passport Servlet initiated");
        super.init(config);
    }
}
