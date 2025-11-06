import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/patient",loadOnStartup = 1)
public class PatientServlet extends GenericServlet {
    public PatientServlet(){
        System.out.println("The Patient Servlet");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("The PatientServlet Running");
        String name=servletRequest.getParameter("name");
        String age=servletRequest.getParameter("age");
        String gender=servletRequest.getParameter("gender");
        String add=servletRequest.getParameter("address");
        String phone=servletRequest.getParameter("phone");
        String email=servletRequest.getParameter("email");
        String disease=servletRequest.getParameter("disease");
        String doctor=servletRequest.getParameter("doctor");
        String date=servletRequest.getParameter("date");
        String comment=servletRequest.getParameter("comment");
        System.out.println("The patient details are");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);
        System.out.println("Address:"+add);
        System.out.println("Phone:"+phone);
        System.out.println("Email:"+email);
        System.out.println("Disease:"+disease);
        System.out.println("Doctor:"+doctor);
        System.out.println("Date:"+date);
        System.out.println("Comment:"+comment);
        System.out.println("----------------------------------------------------------");
        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();
        writer.println("Data saved successfully............"+name);
        writer.println("The patient details are");
        writer.println("Name:"+name);
        writer.println("Age:"+age);
       writer.println("Gender:"+gender);
        writer.println("Address:"+add);
       writer.println("Phone:"+phone);
        writer.println("Email:"+email);
        writer.println("Disease:"+disease);
        writer.println("Doctor:"+doctor);
        writer.println("Date:"+date);
        writer.println("Comment:"+comment);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Patient Servlet Initiated");
        super.init(config);
    }
}
