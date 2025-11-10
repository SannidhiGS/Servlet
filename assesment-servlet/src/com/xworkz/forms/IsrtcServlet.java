package com.xworkz.forms;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/isrtc",loadOnStartup = 1)
public class IsrtcServlet extends GenericServlet {
    public IsrtcServlet(){
        System.out.println("The ISRTC Servlet");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("The ISRTC Servlet Running");
        String inlineRadioOptions=servletRequest.getParameter("inlineRadioOptions");
        String radioDefault2=servletRequest.getParameter("radioDefault2");
        String email=servletRequest.getParameter("email");
        String name=servletRequest.getParameter("name");
        String code=servletRequest.getParameter("code");
        String mob=servletRequest.getParameter("mob");
        String password=servletRequest.getParameter("password");
        String cpassword=servletRequest.getParameter("cpassword");
        String check=servletRequest.getParameter("check");

        System.out.println("Your Data saved succesfully.............."+name);
        System.out.println("Email"+email+"\n"+
                "Name"+name+"\n"
        +"Mobile Number"+mob);

        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();
        writer.println("Data saved successfully......."+name);
        writer.println(inlineRadioOptions+"\n"+email+"\n"+name+"\n"+code+"\n"+mob+"\n"+password+"\n"+"c" +
                cpassword+"\n"+code);


    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Servlet Initialized");
        super.init(config);
    }
}
